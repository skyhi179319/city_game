package gGraphics.Scenes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import gFunctions.House;
import gFunctions.Resources;

public class Stats extends JFrame{
	//  MOMEY VARS
	private int sellFood = 50 * Resources.Store.getStores() * 15;
	private int Casino = (gGraphics.Tiles.House.PEOPLE/6) * 20 * Resources.Casino.getCasinos();
	private int cashOutFood = Resources.Farm.getFood() * 10;
	private int taxes_m() {
		if(gFunctions.Government.taxBuilding.Availability() == true) {
			return 0;
		}
		else if(gGraphics.Tiles.House.PEOPLE == 0) {
    		return 10;
    	}
    	else {
    		return House.countTaxable() * 25;
    	}
    	
	}
	private int taxes = taxes_m() * 60;
	private int mpm = sellFood+Casino+cashOutFood+taxes;
	// GUI
	private void close() {
		super.dispose();
	}
	public Stats() {
		super.setBounds(0, 0, 140, 200);
		JPanel panel = new JPanel();
		JLabel div = new JLabel("-------");
		JLabel mpmLabel = new JLabel("Money/Min: " + Integer.toString(mpm));
		JLabel taxesLabel = new JLabel("Taxes/Min: " + Integer.toString(taxes));
		JLabel CasinoLabel = new JLabel("Casino/Min: " + Integer.toString(Casino));
		int other = sellFood + cashOutFood;
		JLabel otherLabel = new JLabel("Other/Min: " + Integer.toString(other));
		Timer statsRefresher = new Timer(1000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	mpmLabel.setText("Money/Min: " + Integer.toString(mpm));
		    	taxesLabel.setText("Taxes/Min: " + Integer.toString(taxes));
		    	CasinoLabel.setText("Casino/Min: " + Integer.toString(Casino));
		    	otherLabel.setText("Other/Min: " + Integer.toString(other));
		    }
		});
		statsRefresher.start();
		panel.add(mpmLabel);
		panel.add(div);
		panel.add(taxesLabel);
		panel.add(CasinoLabel);
		panel.add(otherLabel);
		
		// GLOBALS
		super.add(panel);
		super.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				close();
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		super.show();
	}
}