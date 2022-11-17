package gGraphics.Tiles;

import java.awt.Color;

import gGraphics.Colors;

public class Government {
	public static void buildTaxBuilding() {
		// cost for road;
		if(gFunctions.Money.hasEnough(1000) == true && gFunctions.Government.taxBuilding.Availability() == true) {
			gFunctions.Money.Subtract(1000);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.brightgreen);
			gFunctions.Government.taxBuilding.addBuilding();
			gFunctions.Government.taxBuilding.start();
		}
		else {
			
		}
	}
}