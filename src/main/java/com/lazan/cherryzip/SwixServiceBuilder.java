package com.lazan.cherryzip;

import java.awt.Container;

import org.swixml.SwingEngine;

import com.lazan.cherryzip.swix.InjectFactory;
import com.lazan.tinyioc.IocException;
import com.lazan.tinyioc.ServiceBuilderContext;
import com.lazan.tinyioc.internal.InjectionServiceBuilder;

public class SwixServiceBuilder<T extends Container> extends InjectionServiceBuilder<T> {
	private final String swixResource;
	
	public SwixServiceBuilder(Class<T> type, String swixResource) {
		super(type);
		this.swixResource = swixResource;
	}
	
	@Override
	public T build(ServiceBuilderContext<T> context) {
		T instance = super.build(context);
		try {
			SwingEngine<T> swix = new SwingEngine<>(instance);
			InjectFactory injectFactory = context.getServiceRegistry().getService(InjectFactory.class);
			swix.getTaglib().registerTag("inject", injectFactory);
			swix.render(swixResource);
		} catch (Exception e) {
			throw new IocException(e, "Error building %s", context.getServiceId());
		}
		return instance;
	}
}
