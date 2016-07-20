package com.lazan.cherryzip;

import javax.swing.UIManager;

import com.lazan.tinyioc.ServiceModule;
import com.lazan.tinyioc.ServiceRegistry;
import com.lazan.tinyioc.ServiceRegistryBuilder;

public class CherryZipMain {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		ServiceModule[] modules = { new CherryZipModule() };
		ServiceRegistry registry = new ServiceRegistryBuilder().withModules(modules).build();
		MainFrame mainFrame = registry.getService(MainFrame.class);
		mainFrame.setVisible(true);
	}
}
