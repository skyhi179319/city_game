package gFunctions;

import java.util.ArrayList;

public class Water {
	public static ArrayList<Integer> wateredHouses = new ArrayList<Integer>();
	private static int water;
	public static void addWater(int i) {
		water = water + i;
	}
	// checks from buying houses
	public static boolean checkStatus() {
		if(water > wateredHouses.size()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}