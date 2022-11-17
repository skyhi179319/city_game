package gGraphics;
import gFunctions.*;
import java.awt.GridLayout;

import javax.swing.*;

public class Bottom_toolbar extends JPanel{
	public Bottom_toolbar() {
		super.setLayout(new GridLayout(1,6));
		super.add(new Money.money_counter());
		super.add(new Resources.Farm.Food_counter());
		super.add(new House.People_Counter());
	}
}