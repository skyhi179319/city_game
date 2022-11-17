package gFunctions;

import java.util.ArrayList;


public class Power {
	public static ArrayList<Integer> poweredHouses = new ArrayList<Integer>();
	private static int power;
	public static void addPower(int i) {
		power = power + i;
	}
	// checks from buying houses
	public static boolean checkStatus() {
		if(power > poweredHouses.size()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}