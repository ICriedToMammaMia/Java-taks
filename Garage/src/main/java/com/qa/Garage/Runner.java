package com.qa.Garage;

public class Runner {
	
	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();
		
		
		Car car1 = new Car("R8", 2, 5, 8, true, true, "Ford" );
		
		
		
		
				
		
		System.out.println(car1.isCdPlayer());
		car1.forward();
		
		
		Motorcycle mb1 = new Motorcycle("R8", 2, 200, true, false);
		
		System.out.println(mb1.getWheelNum());
		System.out.println(mb1.isHasWindshield());
		mb1.park();
		
		
		Bike bike1 = new Bike("Person", 2, 30, true, true);
		
		bike1.backward();
		System.out.println(bike1.isPedals());
		
		garageclass g1 = new garageclass();
		
		g1.addVehicles(car1);
		g1.addVehicles(mb1);
		g1.addVehicles(bike1);
		
//		garageClass.garageVehicles.stream();
		
		g1.calculateBill();
		
		
	
	
	
	}
	
	

}
