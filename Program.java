import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import gGraphics.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Grid
		Grid main = new Grid(25,25);
		// Top toolbar
		Top_toolbar top_toolbar = new Top_toolbar();
		// setting grid
		main.set();
		// main window
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 1000, 1000);
		frame.add(top_toolbar, BorderLayout.NORTH);
		frame.add(main,BorderLayout.CENTER);
		frame.add(new Bottom_toolbar(),BorderLayout.SOUTH);
		Menu.menuItem[] menuItems = {new Menu.menuItem("Stats", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new gGraphics.Scenes.Stats();
			}
		})};
		Menu.menu[] menu = {new Menu.menu("Stats", menuItems)};
		frame.setJMenuBar(new Menu.menuBar(menu));
		frame.show();
	}
}
