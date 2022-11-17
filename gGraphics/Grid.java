package gGraphics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.LineBorder;

import gGraphics.Tiles.Tile;

public class Grid extends JPanel{
	// inti vars
	private static int r;
	private static int c;
	// cells
	public static ArrayList<Tile> tiles = new ArrayList<Tile>();
	// constructor
	public Grid(int col, int rows) {
		r = rows;
		c = col;
	}
	// the number of the button clicked
	public static int button_clicked;
	// setting grid
	public void set() {
		super.setLayout(new GridLayout(r,c));
		for (int i = 0; i < r*c; i++) {
			Tile j = new Tile();
			j.setName(String.valueOf(i));
			j.setBackground(Colors.blue);
			// comment out once figuring out number;
			//j.setText(String.valueOf(i));
			tiles.add(j);
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					button_clicked = Integer.parseInt(j.getName());
					System.out.println(button_clicked);
				}
				
			});
			super.add(j);
		}
	}
}