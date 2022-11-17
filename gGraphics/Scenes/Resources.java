package gGraphics.Scenes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Resources extends JFrame{
	private void close() {
		super.dispose();
	}
	public Resources() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		JButton Farm = new JButton("Farm");
		JButton Store = new JButton("Store");
		JButton Casino = new JButton("Casino");
		Farm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.Farm.buildFarm();
				}
				close();
			}
		});
		Store.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.Store.buildStore();
				}
				close();
			}
		});
		Casino.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.Casino.buildCasino();
				}
				close();
			}
		});
		panel.add(Farm);
		panel.add(Store);
		panel.add(Casino);
		super.add(panel);
		super.setBounds(0,0,300,300);
		super.show();
	}
}