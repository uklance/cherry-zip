package com.lazan.cherryzip;

import com.lazan.cherryzip.swix.InjectFactory;
import com.lazan.tinyioc.ServiceBinder;
import com.lazan.tinyioc.ServiceModule;

public class CherryZipModule implements ServiceModule {
	@Override
	public void bind(ServiceBinder binder) {
		binder.bind(MainFrame.class, new SwixServiceBuilder<>(MainFrame.class, "main.xml"));
		binder.bind(LeftPanel.class, new SwixServiceBuilder<>(LeftPanel.class, "left-panel.xml"));
		binder.bind(RightPanel.class, new SwixServiceBuilder<>(RightPanel.class, "right-panel.xml"));
		binder.bind(InjectFactory.class);
	}
}
