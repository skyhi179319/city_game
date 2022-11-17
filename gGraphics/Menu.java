package gGraphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	public static class menuItem extends JMenuItem{
		public menuItem(String text,ActionListener action) {
			super.setText(text);
			super.addActionListener(action);
			super.setBackground(getBackground());
		}
	}
	public static class menu extends JMenu{
		public menu(String text,menuItem[] items) {
			super.setText(text);
			for (int i = 0; i < items.length; i++) {
				super.add(items[i]);
			}
		}
	}
	public static class menuBar extends JMenuBar {
		public menuBar(menu[] items) {
			for (int i = 0; i < items.length; i++) {
				super.add(items[i]);
			}
		}
	}
}