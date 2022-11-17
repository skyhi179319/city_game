package gFunctions;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class House {
	public static boolean ableToBuy() {
		if(gFunctions.Power.checkStatus() && gFunctions.Water.checkStatus()) {
			return true;
		}
		else {
			return false;
		}	
	}
	public static class People_Counter extends JPanel {
		public People_Counter() {
			super.setLayout(new GridLayout(1,2));
			JLabel peopleLabel = new JLabel("Population: ");
			JLabel people = new JLabel(Integer.toString(gGraphics.Tiles.House.PEOPLE));
			super.add(peopleLabel);
			super.add(people);
			Timer peopleTime = new Timer(1000, new ActionListener(){
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	people.setText(Integer.toString(gGraphics.Tiles.House.PEOPLE));
			    }
			});
			peopleTime.start();
		}
	}
	public static int countTaxable() {
		if(gGraphics.Tiles.House.PEOPLE == 6) {
			return 4;
		}
		else {
			return gGraphics.Tiles.House.PEOPLE/3;
		}
	}
}