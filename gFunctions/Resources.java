package gFunctions;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/*
 * THREADS IN THIS FILE
 * Thread 1 - Food Counter - every second 
 * Thread 2 - Farm Adder - every 30 seconds
 * Thread 3 - sell food - every minute
 * Thread 4 - Casino - every minute
 * Thread 5 - Add Food - every 61 seconds 
 */

public class Resources {
	public static void cashoutFood() {
		Money.Add(Farm.getFood() * 10);
		Farm.clearFood();
	}
	public static class Farm{
		public static class Food_counter extends JPanel {
			public Food_counter() {
				super.setLayout(new GridLayout(1,2));
				JLabel foodLabel = new JLabel("Food In Farm/Store: ");
				JLabel food = new JLabel(Integer.toString(limits.food));
				super.add(foodLabel);
				super.add(food);
				Timer foodT = new Timer(1000, new ActionListener(){
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	food.setText(Integer.toString(limits.food) + "/" + 
				    	Integer.toString(Store.getStoreFood()));
				    }
				});
				foodT.start();
			}
		}
		private static class limits{
			private static int farms = 0;
			private static int food = 0;
		}
		public static Timer FarmAdder = new Timer(30000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	limits.food = limits.food + 10 * limits.farms;
		    	if(limits.food > gGraphics.Tiles.House.PEOPLE) {
		    		limits.food = limits.food - gGraphics.Tiles.House.PEOPLE;
		    	}
		    }
		});
		public static void start() {
			if(limits.farms == 1) {
				FarmAdder.start();
			}
			else {
				
			}
		}
		public static void addBuilding() {
			limits.farms = limits.farms + 1;
		}
		public static void clearFood() {
			limits.food = 0;
		}
		public static int getFood() {
			return limits.food;
		}
	}
	public static class Store{
		private static class limits{
			private static int food;
			private static int stores;
		}
		public static Timer sellFood = new Timer(60000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	if(limits.food > limits.food - 50 * limits.stores) {
		    		limits.food = limits.food - 50 * limits.stores;
		    		Money.Add(50 * limits.stores * 15);
		    	}
		    }
		});
		public static Timer addFoodT = new Timer(60000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	addFood();
		    }
		});
		public static void SellFoodstart() {
			if(limits.stores == 1) {
				sellFood.start();
			}
			else {
				
			}
		}
		public static void AddFoodstart() {
			if(limits.stores == 1) {
				addFoodT.start();
			}
			else {
				
			}
		}
		private static void addFood() {
			limits.food = limits.food + getFood();
			cashoutFood();
		}
		public static void addBuilding() {
			limits.stores = limits.stores + 1;
		}
		private static int getStoreFood() {
			return limits.food;
		}
		private static int getFood() {
			return Farm.limits.food;
		}
		public static int getStores() {
			return limits.stores;
		}
		public static void sellFoodTo(int i) {
			if(limits.food >= i) {
				limits.food = limits.food - i;
			}
		}
	}
	public static class Casino{
		private static class limits{
			public static int Casinos;
		}
		public static Timer Casino = new Timer(15000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	Store.sellFoodTo(gGraphics.Tiles.House.PEOPLE/6);
		    	Money.Add((gGraphics.Tiles.House.PEOPLE/6) * 20 * limits.Casinos);
		    	System.out.println((gGraphics.Tiles.House.PEOPLE/6) * 20 * limits.Casinos);
		    }
		});
		public static void start() {
			Casino.start();
		}
		public static void addCasino() {
			limits.Casinos = limits.Casinos + 1;
		}
		public static int getCasinos() {
			return limits.Casinos;
		}
	}
}