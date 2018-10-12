package com.qa.Garage;

public class Bike extends Vehicle{
	
	public static boolean comfySeat;
	public static boolean pedals;
	
	public Bike(String engine, int wheelNum, int topSpeed, boolean comfySeat, boolean pedals) {
		super(engine, wheelNum, topSpeed);
		this.comfySeat = comfySeat;
		this.pedals = pedals;		
		
	}

	public static boolean isComfySeat() {
		return comfySeat;
	}

	public void setComfySeat(boolean comfySeat) {
		this.comfySeat = comfySeat;
	}

	public static boolean isPedals() {
		return pedals;
	}

	public void setPedals(boolean pedals) {
		this.pedals = pedals;
	}
	
	@Override
	public void backward() {
		System.out.println("The Bike has moved backward");

	}
	
	@Override
	public void forward() {
		System.out.println("The Bike has moved forward");

	}
	
	@Override
	public void park() {
		System.out.println("The Bike has parked");

	}
	
	
	

}
