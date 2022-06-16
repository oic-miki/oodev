package model;

import java.util.ArrayList;
import java.util.List;

public class Lane {
	
	private VendingMachine vendingMachine;
	private int number;
	private List<Drink> drinks = new ArrayList<Drink>();
	
	public Lane(VendingMachine vendingMachine, int number) {
		
		this.vendingMachine = vendingMachine;
		this.number = number;
		
	}
	
	public VendingMachine getVendingMachine() {
		
		return vendingMachine;
		
	}
	
	public int getNumber() {
		
		return number;
		
	}
	
	public boolean hasDrink() {
		
		return !drinks.isEmpty();
		
	}
	
	public int getPrice() {
		
		return drinks.get(0).getPrice();
		
	}
	
	public Drink addDrink(Drink drink) {
		
		drinks.add(drink);
		
		return drink;
		
	}
	
	public Drink removeDrink() {
		
		return drinks.get(drinks.size() - 1);
		
	}
	
}
