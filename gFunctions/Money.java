package gFunctions;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/*
 * THREADS IN THiS FILE
 * Thread 1 - Money Counter - Every Second
 */
public class Money {
	private static int city_money = 50000;
	public static int getMoney() {
		return city_money;
	}
	public static void Add(int i) {
		city_money = getMoney() + i;
	}
	public static void Subtract(int i) {
		city_money = getMoney() - i;
	}
	private static int Subtract_m(int i) {
		int m = getMoney() - i;
		return m;
	}
	public static boolean hasEnough(int i) {
		if(getMoney() > Subtract_m(i)) {
			return true;
		}
		else {
			return false;	
		}
	}
	public static class money_counter extends JPanel {
		public money_counter() {
			super.setLayout(new GridLayout(1,2));
			JLabel moneyLabel = new JLabel("City Money: ");
			JLabel money = new JLabel("$" + getMoney());
			super.add(moneyLabel);
			super.add(money);
			Timer myTimer = new Timer(1000, new ActionListener(){
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	money.setText("$" + getMoney());
			    }
			});
			myTimer.start();
		}
	}
}