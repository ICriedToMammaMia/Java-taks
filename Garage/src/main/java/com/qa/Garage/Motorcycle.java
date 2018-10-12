package com.qa.Garage;

public class Motorcycle extends Vehicle {

	private static boolean storageCompartment;
	private static boolean hasWindshield;

	public Motorcycle(String engine, int wheelNum, int topSpeed, boolean storageCompartment, boolean hasWindshield) {
		super(engine, wheelNum, topSpeed);
		this.storageCompartment = storageCompartment;
		this.hasWindshield = hasWindshield;

	}

	public static boolean isStorageCompartment() {
		return storageCompartment;
	}

	public void setStorageCompartment(boolean storageCompartment) {
		this.storageCompartment = storageCompartment;
	}

	public static boolean isHasWindshield() {
		return hasWindshield;
	}

	public void setHasWindshield(boolean hasWindshield) {
		this.hasWindshield = hasWindshield;
	}
	
	@Override
	public void backward() {
		System.out.println("The motorcycle has moved backward");

	}
	
	@Override
	public void forward() {
		System.out.println("The motorcycle has moved forward");

	}
	
	@Override
	public void park() {
		System.out.println("The motorcycle has parked");

	}

}
