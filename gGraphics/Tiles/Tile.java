package gGraphics.Tiles;

import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;

import javax.swing.border.LineBorder;

import gGraphics.Grid;

public class Tile extends javax.swing.JButton{
	private static Color color_one;
	private static Color color_two;
	private static Color color_three;
	public Tile() {
		color_one = Color.LIGHT_GRAY;
		color_two = Color.LIGHT_GRAY;
		color_three = Color.LIGHT_GRAY;
		super.setBorder(new LineBorder(Color.white));
	    super.setForeground(getForeground());
	}
	public void updateBackground(Color background) {
		Graphics g = Grid.tiles.get(Grid.button_clicked).getGraphics();
		Graphics2D g2 = (Graphics2D) g.create();
		color_one = background;
		color_two = background;
		color_three = background;
		g2.setPaint(new LinearGradientPaint(0, 20, 0,35,
        new float[] { 0.0f, 0.25f, 0.45f},
        new Color[] { color_one,
        color_two,
        color_three },MultipleGradientPaint.CycleMethod.NO_CYCLE));
	    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
	    setBackground(background);
	    setForeground(getForeground());
	    setBorder(new LineBorder(Color.white));
	    g2.setPaint(getForeground());
	    g2.dispose();
		super.update(g2);
		super.setOpaque(true);
	}
	public void updateBackground(Color color1, Color color2) {
		Graphics g = Grid.tiles.get(Grid.button_clicked).getGraphics();
		Graphics2D g2 = (Graphics2D) g.create();
		color_one = color1;
		color_two = color2;
		color_three = color1;
		g2.setPaint(new LinearGradientPaint(0, 20, 0,35,
        new float[] { 0.0f, 0.25f, 0.45f},
        new Color[] { color_one,
        color_two,
        color_three },MultipleGradientPaint.CycleMethod.NO_CYCLE));
	    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
	    setBackground(color1);
	    setForeground(getForeground());
	    setBorder(new LineBorder(Color.white));
	    g2.setPaint(getForeground());
	    g2.dispose();
		super.update(g2);
		super.setOpaque(true);
	}
	/*
	@Override
	public void paintComponent(Graphics g) {
		// y = height
		// x = width
		Graphics2D g2 = (Graphics2D) g.create();
	    //g2.setPaint(new GradientPaint(new Point(0, 0), color_one, new Point(0,getHeight()),color_two));
	    // 0, 20, 0,35
	    // 0.50f, 0.0f, getHeight(), getWidth()
	    g2.setPaint(new LinearGradientPaint(0, 20, 0,35,
        new float[] { 0.0f, 0.25f, 0.45f},
        new Color[] { color_one,
        color_two,
        color_three },MultipleGradientPaint.CycleMethod.NO_CYCLE));
	    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
	    setBorder(new LineBorder(Color.white));
	    
	}
	*/
}