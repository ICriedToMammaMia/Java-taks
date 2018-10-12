package com.qa.Game;

public class Player {

	private static int distanceToChest = 40;
	private static int wCount = 0;
	private static int eCount = 0;
	private static int nCount = 0;
	private static int sCount = 0;

	public void player(int distanceToChest) {
		this.distanceToChest = distanceToChest;
	}

	public int getDistanceToChest() {
		return this.distanceToChest;
	}

	public void setDistanceToChest() {
		this.distanceToChest = distanceToChest;
	}
	
	
	
	
	
	

	public void moveWest() {

		if (wCount < eCount) {
			distanceToChest = distanceToChest - 5;
			if (distanceToChest == 0) {
				System.out.println("Well done you have found the treasure");
			} else
				System.out.println("The distance to the chest = " + (distanceToChest));

		} else if (wCount >= eCount) {
			distanceToChest = distanceToChest + 5;

			System.out.println("The distance to the chest = " + (distanceToChest));
		}
		wCount = wCount + 1;

	}

	public void moveEast() {

		if (eCount < wCount) {
			distanceToChest = distanceToChest - 5;
			if (distanceToChest == 0) {
				System.out.println("Well done you have found the treasure");

			} else
				System.out.println("The distance to the chest = " + (distanceToChest));

		} else if (eCount >= wCount) {
			distanceToChest = distanceToChest + 5;
			System.out.println("The distance to the chest = " + (distanceToChest));
		}

		eCount = eCount + 1;

	}

	public void moveNorth() {
		nCount = nCount + 1;

		if (nCount >= sCount && eCount == wCount || nCount < sCount && eCount == wCount) {
			distanceToChest = distanceToChest - 5;
			System.out.println("The distance to the chest = " + (distanceToChest) + "m");
			if (distanceToChest == 0) {
				System.out.println("Well done you have found the treasure");
			}
		}

		if (eCount != wCount) {
			distanceToChest = distanceToChest + 5;

			System.out.println("The distance to the chest = " + (distanceToChest + "m"));
		}
	}

	public void moveSouth() {

		if (sCount < nCount) {
			distanceToChest = distanceToChest + 5;
			System.out.println("The distance to the chest = " + (distanceToChest) + "m");
		} else if (sCount >= nCount) {
			distanceToChest = distanceToChest + 5;
			System.out.println("The distance to the chest = " + (distanceToChest) + "m");
		}

		if (distanceToChest == 0) {
			System.out.println("Well done you have found the treasure");

		}

		sCount = sCount + 1;

	}

}
