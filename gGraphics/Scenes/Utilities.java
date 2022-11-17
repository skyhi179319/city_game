package gGraphics.Scenes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Utilities extends JFrame{
	private void close() {
		super.dispose();
	}
	public Utilities() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		JButton Power = new JButton("Power");
		JButton Water = new JButton("Water");
		JButton Cancel = new JButton("Cancel");
		Power.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.Power.buildPowerSource();
				}
				close();
			}
		});
		Water.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.Water.buildWaterSource();
				}
				close();
				
			}
		});
		Cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				close();
				
			}
		});
		panel.add(Power);
		panel.add(Water);
		panel.add(Cancel);
		super.add(panel);
		super.setBounds(0,0,300,300);
		super.show();
	}
}