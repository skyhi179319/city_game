package gGraphics.Tiles;

import java.awt.Color;
import java.util.ArrayList;

public class Water {
	private static ArrayList<Integer> water = new ArrayList<Integer>();
	public static boolean hasWaterSource() {
		if(water.contains(gGraphics.Grid.button_clicked)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void buildWaterSource() {
		// cost for road;
		if(gFunctions.Money.hasEnough(2000) == true) {
			gFunctions.Money.Subtract(2000);
			gFunctions.Water.addWater(6);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Color.blue.brighter());
			water.add(gGraphics.Grid.button_clicked);
		}
		else {
			
		}
	}
}