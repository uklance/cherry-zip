package com.lazan.cherryzip;

import java.awt.HeadlessException;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private final LeftPanel leftPanel;
	private final RightPanel rightPanel;
	
	public MainFrame(LeftPanel leftPanel, RightPanel rightPanel) throws HeadlessException {
		super();
		this.leftPanel = leftPanel;
		this.rightPanel = rightPanel;
	}

	@Override
	public String toString() {
		return String.format("MainFrame[left=%s, right=%s]", leftPanel,  rightPanel);
	}
}
