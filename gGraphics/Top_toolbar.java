package gGraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Top_toolbar extends JPanel{
	public Top_toolbar() {
		super.setLayout(new GridLayout(1,5));
		JButton Roads = new JButton("Roads");
		Roads.setName("Roads");
		Roads.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad() == true) {
					
				}
				else {
					gGraphics.Tiles.Road.buildRoadPiece();
				}
			}
		});
		JButton Utilities = new JButton("Utilities");
		Utilities.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new gGraphics.Scenes.Utilities();
			}
		});
		JButton Government = new JButton("Government");
		Government.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new gGraphics.Scenes.Government();
			}
		});
		JButton Housing = new JButton("Housing");
		Housing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Tiles.Road.hasRoad()) {
					
				}
				else {
					gGraphics.Tiles.House.buildHouse();
				}
			}
		});
		JButton Resources = new JButton("Resources");
		Resources.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new gGraphics.Scenes.Resources();
			}
		});
		super.add(Roads);
		super.add(Utilities);
		super.add(Government);
		super.add(Housing);
		super.add(Resources);
	}
}