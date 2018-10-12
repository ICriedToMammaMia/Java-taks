package com.qa.Garage;

public class Car extends Vehicle {

	private static int seatNum;

	private static boolean satNav;

	private static boolean cdPlayer;

	private static String make;

	public Car(String engine, int wheelNum, int topSpeed, int seatNum, boolean satNav, boolean cdPlayer, String make) {

		super(engine, wheelNum, topSpeed);
		this.seatNum = seatNum;
		this.satNav = satNav;
		this.cdPlayer = cdPlayer;
		this.make = make;
	}

	public static int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public static boolean isSatNav() {
		return satNav;
	}

	public void setSatNav(boolean satNav) {
		this.satNav = satNav;
	}

	public static boolean isCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(boolean cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public static String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public void forward() {
		System.out.println("the car has moved forward");

	}

	@Override
	public void backward() {
		System.out.println("The car has moved backward");

	}

	@Override
	public void park() {
		System.out.println("The car has parked");

	}
	
	@Override
	public int calculate() {
		
		int satNav = 0;
		int cdPlayer = 0;
		if (Car.isSatNav() == true) {
			satNav = satNav + 200;
		}
		if (Car.isCdPlayer() == true) {
			cdPlayer = cdPlayer + 100;
		}
		
		return super.calculate() + 10 * this.getSeatNum() + satNav + cdPlayer;
	}

}
