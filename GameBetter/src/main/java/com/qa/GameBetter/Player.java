package com.qa.GameBetter;

public class Player {
	
	
	private int treasureX = 22;
	private int treasureY = 22;
	
	private int xCoord = 20;
	private int yCoord = 20;
	
	private int distanceX = treasureX - xCoord;
	private int distanceY = treasureY - yCoord;
	
	
	
	public void moveNorth() {
		yCoord = yCoord + 1;
		distanceY = treasureY - yCoord;
		distanceX = treasureX - xCoord;
		System.out.println("Distance from treasure = " + distanceX + "," + distanceY);
		if(distanceY == 0 && distanceX == 0) {
			System.out.println("You found the treasure!!!");
		} else if (distanceY != 0 || distanceX != 0)	
			System.out.println("Which direction do you want to move next?");
	}
	
	
	public void moveSouth() {
		yCoord = yCoord - 1;
		distanceY = treasureY - yCoord;
		distanceX = treasureX - xCoord;
		System.out.println("Distance from treasure = " + distanceX + "," + distanceY);
		if(distanceY == 0 && distanceX == 0) {
			System.out.println("You found the treasure!!!");
		} else if (distanceY != 0 || distanceX != 0)	
			System.out.println("Which direction do you want to move next?");		
	}
	
	
	public void moveEast() {
		xCoord = xCoord + 1;
		distanceY = treasureY - yCoord;
		distanceX = treasureX - xCoord;
		System.out.println("Distance from treasure = " + distanceX + "," + distanceY);
		if(distanceY == 0 && distanceX == 0) {
			System.out.println("You found the treasure!!!");
		} else if (distanceY != 0 || distanceX != 0)	
			System.out.println("Which direction do you want to move next?");		
	}
	
	
	
	public void moveWest() {
		xCoord = xCoord - 1;
		distanceY = treasureY - yCoord;
		distanceX = treasureX - xCoord;
		System.out.println("Distance from treasure = " + distanceX + "," + distanceY);
		if(distanceY == 0 && distanceX == 0) {
			System.out.println("You found the treasure!!!");
		} else if (distanceY != 0 || distanceX != 0)	
			System.out.println("Which direction do you want to move next?");		
	}
	
	
	


	public int getDistanceX() {
		return distanceX;
	}


	public void setDistanceX(int distanceX) {
		this.distanceX = distanceX;
	}


	public int getDistanceY() {
		return distanceY;
	}


	public void setDistanceY(int distanceY) {
		this.distanceY = distanceY;
	}


	public int getTreasureX() {
		return treasureX;
	}


	public void setTreasureX(int treasureX) {
		this.treasureX = treasureX;
	}


	public int getTreasureY() {
		return treasureY;
	}


	public void setTreasureY(int treasureY) {
		this.treasureY = treasureY;
	}


	public int getxCoord() {
		return xCoord;
	}


	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}


	public int getyCoord() {
		return yCoord;
	}


	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
			
		

}
