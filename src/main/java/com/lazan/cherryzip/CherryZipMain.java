package com.lazan.cherryzip;

import javax.swing.UIManager;

import com.lazan.tinyioc.ServiceRegistry;
import com.lazan.tinyioc.ServiceRegistryBuilder;

public class CherryZipMain {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		ServiceRegistry registry = new ServiceRegistryBuilder()
				.withModuleType(CherryZipModule.class)
				.build();
		MainFrame mainFrame = registry.getService(MainFrame.class);
		mainFrame.setVisible(true);
	}
}
