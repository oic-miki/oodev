package model;

public class Button {
	
	private Lane lane;
	private boolean lightOn = false;
	
	public Button(Lane lane) {
		
		this.lane = lane;
		
	}
	
	public Lane getLane() {
		
		return lane;
		
	}
	
	public void update() {
		
		if (lane.hasDrink()) {
			
			lightOn = lane.getVendingMachine().getMoney() >= lane.getPrice();
			
		} else {
			
			// TODO ”„‚èØ‚êˆ—
			lightOn = false;
			
		}
		
	}
	
	public boolean isLightOn() {
		
		return lightOn;
		
	}
	
}
