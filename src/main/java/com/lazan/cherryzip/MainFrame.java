package com.lazan.cherryzip;

import javax.inject.Inject;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	@Inject
	private LeftPanel leftPanel;
	
	@Inject
	private RightPanel rightPanel;
	
	@Override
	public String toString() {
		return String.format("MainFrame[left=%s, right=%s]", leftPanel,  rightPanel);
	}
}
