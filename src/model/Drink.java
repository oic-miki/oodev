package model;

public class Drink {
	
	private String name;
	private int price;
	
	public Drink(String name, int price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getPrice() {
		
		return price;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		
		str.append("\nname = ");
		str.append(name);
		str.append("\nprice = ");
		str.append(price);
		
		return str.toString();
		
	}
	
}
