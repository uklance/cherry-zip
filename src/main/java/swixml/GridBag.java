package swixml;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

import org.swixml.SwingEngine;

public class GridBag extends SwingEngine {
	/** Default ctor for a SwingEngine. */

	private GridBag() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Container container = render("gridbag.xml");
			Dimension sc = Toolkit.getDefaultToolkit().getScreenSize();
			container.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new GridBag();
	}
}