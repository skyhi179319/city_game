package gFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Government {
	public static class limits{
		private static int tax_building = 0;
	}
	public static class taxBuilding {
		public static Timer MoneyAdder = new Timer(1000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	if(gGraphics.Tiles.House.PEOPLE == 0) {
		    		Money.Add(10);
		    	}
		    	else {
		    		Money.Add(House.countTaxable() * 25);
		    	}
		    }
		});
		public static void start() {
			MoneyAdder.start();
		}
		public static boolean Availability() {
			if(limits.tax_building == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		public static void addBuilding() {
			limits.tax_building = 1;
		}
	}
}