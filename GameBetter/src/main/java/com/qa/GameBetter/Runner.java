package com.qa.GameBetter;

import java.util.Scanner;



public class Runner {

	public static void main(String[] args) {
		
		
		
		
		Player player1 = new Player();
		
		
		System.out.println("There is a hidden treasure in this area.");
		
		System.out.println("Your gps has located it to within 20m of your location.");
		System.out.println("Search the area to find where the treausure is!");
		System.out.println("Enter the direction you want to move in.");
		System.out.println("You can move North, East. South or West.");

		while (player1.getDistanceX() != 0 || player1.getDistanceY() != 0) {
			Scanner scanner = new Scanner(System.in);
			String direction = scanner.nextLine();

			String directionString;
			switch (direction) {

			case "North":
				player1.moveNorth();
				break;

			case "north":
				player1.moveNorth();
				break;

			case "South":
				player1.moveSouth();
				break;

			case "south":
				player1.moveSouth();
				break;

			case "West":
				player1.moveWest();
				break;

			case "west":
				player1.moveWest();
				break;

			case "East":
				player1.moveEast();
				break;

			case "east":
				player1.moveEast();
				break;
			}

		}

	}
}
