package gGraphics.Tiles;

import java.awt.Color;
import java.util.ArrayList;

public class Power {
	private static ArrayList<Integer> power = new ArrayList<Integer>();
	public static boolean hasPowerSource() {
		if(power.contains(gGraphics.Grid.button_clicked)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void buildPowerSource() {
		// cost for road;
		if(gFunctions.Money.hasEnough(2000) == true) {
			gFunctions.Money.Subtract(2000);
			// adds overall power
			gFunctions.Power.addPower(6);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Color.YELLOW);
			power.add(gGraphics.Grid.button_clicked);
		}
		else {
			
		}
	}
}