package gGraphics.Scenes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Government extends JFrame{
	private void close() {
		super.dispose();
	}
	public Government() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		JButton Tax_Building = new JButton("Tax");
		Tax_Building.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.Government.buildTaxBuilding();
				}
				close();
			}
		});
		panel.add(Tax_Building);
		super.add(panel);
		super.setBounds(0,0,300,300);
		super.show();
	}
}