package com.lazan.cherryzip;

import com.lazan.tinyioc.ServiceBinder;
import com.lazan.tinyioc.ServiceModule;

public class CherryZipModule implements ServiceModule {
	@Override
	public void bind(ServiceBinder binder) {
		binder.bind(MainWindow.class, new SwixmlServiceBuilder<>(MainWindow.class, "jgoodies.xml"));
	}
}
