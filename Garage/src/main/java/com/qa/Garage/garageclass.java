package com.qa.Garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class garageclass {

	private List<Vehicle> garageVehicles = new ArrayList<Vehicle>();

	public void addVehicles(Vehicle newVehicle) {
		garageVehicles.add(newVehicle);

	}

	public void checklist() {
		garageVehicles.stream().forEach(System.out::println);
	}
	
	public void calculateBill() {
		
		garageVehicles.stream().map(v -> v.calculate()).forEach(System.out::println);
		
		
	}

	
	
	
	
	
	
	
	
/*	public int makeBill(Vehicle vehicleBill) {

		int vehicleCost = 0;

		if (vehicleBill instanceof Car) {

			vehicleCost = (Vehicle.getWheelNum() * 1000) + (Vehicle.getTopSpeed() * 100);

			vehicleCost = vehicleCost + (Car.getSeatNum() * 10000);

			if (Car.isSatNav() == true) {
				vehicleCost = vehicleCost + 2000;
			}
			if (Car.isCdPlayer() == true) {
				vehicleCost = vehicleCost + 500;
			}

		}

		else if (vehicleBill instanceof Motorcycle) {
			vehicleCost = (Vehicle.getWheelNum() * 1000) + (Vehicle.getTopSpeed() * 100);

			if (Motorcycle.isStorageCompartment() == true) {
				vehicleCost = vehicleCost + 500;
			}
			if (Motorcycle.isHasWindshield() == true) {
				vehicleCost = vehicleCost + 100;
			}

		}

		else if (vehicleBill instanceof Bike) {
			vehicleCost = (Vehicle.getWheelNum() * 1000) + (Vehicle.getTopSpeed() * 100);

			if (Bike.isComfySeat() == true) {
				vehicleCost = vehicleCost + 500;
			}
			if (Bike.isPedals() == true) {
				vehicleCost = vehicleCost + 100;
			}

		}
		System.out.println(vehicleCost);
		return vehicleCost;

	}
*/
}
