package com.lazan.cherryzip.swix;

import java.awt.LayoutManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;

import org.swixml.Factory;
import org.swixml.Parser;
import org.swixml.dom.Attribute;
import org.w3c.dom.Element;

public class InjectFactory implements Factory {

	@Override
	public Object create(Object owner, Element element) throws Exception {
		String fieldName = element.getAttribute("field");
		if (fieldName == null || fieldName.trim().length() == 0) {
			throw new RuntimeException("'field' attribute must be specified for inject");
		}
		Field field = owner.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		return field.get(owner);
	}

	@Override
	public Object newInstance(Object... parameter)  {
		return null;
	}

	@Override
	public Class<?> getTemplate() {
		return Void.class;
	}

	@Override
	public Collection<Method> getSetters() {
		return Collections.emptySet();
	}

	@Override
	public Class<?>[] getPropertyType(Object bean, String name) {
		return null;
	}

	@Override
	public void setProperty(Object bean, Attribute attr, Object value, Class<?> type) throws Exception {
	}

	@Override
	public boolean process(Parser p, Object parent, Element child, LayoutManager layoutMgr) throws Exception {
		return false;
	}
}
