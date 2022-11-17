package gGraphics.Tiles;

import java.awt.Color;

import gGraphics.Colors;

public class Store {
	public static void buildStore() {
		// cost for road;
		if(gFunctions.Money.hasEnough(2000) == true) {
			gFunctions.Money.Subtract(2000);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.lightgreen);
			gFunctions.Resources.Store.addBuilding();
			gFunctions.Resources.Store.SellFoodstart();
			gFunctions.Resources.Store.AddFoodstart();
		}
		else {
			
		}
	}
}