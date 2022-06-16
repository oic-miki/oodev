package model;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
	
	private Map<Integer, Lane> laneMap = new HashMap<Integer, Lane>();
	private Map<Integer, Button> buttonMap = new HashMap<Integer, Button>();
	private int money = 0;
	
	public VendingMachine() {
		
		for (int laneNumber = 1; laneNumber < 10; laneNumber++) {
			
			Lane lane = new Lane(this, laneNumber);
			
			laneMap.put(lane.getNumber(), lane);
			
			buttonMap.put(lane.getNumber(), new Button(lane));
			
		}
		
	}
	
	public Drink addDrink(int laneNumber, Drink drink) {
		
		return laneMap.get(laneNumber).addDrink(drink);
		
	}
	
	public int getMoney() {
		
		return money;
		
	}
	
	public int addMoney(int money) {
		
		this.money += money;
		
		buttonMap.values().forEach(button -> {
			
			button.update();
			
		});
		
		return this.money;
		
	}
	
	public boolean isLightOn(int laneNumber) {
		
		return buttonMap.get(laneNumber).isLightOn();
		
	}
	
	public Drink pushButton(int laneNumber) {
		
		Drink drink = laneMap.get(laneNumber).removeDrink();
		
		money -= drink.getPrice();
		
		return drink;
		
	}
	
	public int refund() {
		
		int refundMoney = money;
		
		// “Š“üŠz‚ğƒ[ƒ‚É‚·‚é
		money = 0;
		
		return refundMoney;
		
	}
	
}
