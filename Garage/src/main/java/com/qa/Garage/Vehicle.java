package com.qa.Garage;

abstract class Vehicle {

	private String engine;

	private  int wheelNum;

	private  int topSpeed;

	

	
	

	public Vehicle(String engine, int wheelNum, int topSpeed) {
		this.engine = engine;
		this.wheelNum = wheelNum;
		this.topSpeed = topSpeed;
	}

	
	
	
	
	
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public  int getWheelNum() {
		return wheelNum;
	}

	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}

	public  int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public void forward() {
		System.out.println("vehicle has moved forward");
	}

	public void backward() {
		System.out.println("Vehicle moved backward");
	}

	public void park() {
		System.out.println("Vehicle has parked");
	}
	
	public int calculate ( ) {
	
	
		return (this.getWheelNum() * 10000) + (this.getTopSpeed() * 100);
				
	}
	
	

}
