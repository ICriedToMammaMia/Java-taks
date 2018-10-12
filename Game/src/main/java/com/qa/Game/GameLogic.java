package com.qa.Game;

public class GameLogic {

	int distanceToChest = 20;
	int wCount = 0;
	int eCount = 0;
	int nCount = 0;
	int sCount = 0;

	public String moveWest() {

		wCount = wCount + 1;
		if (wCount < eCount) {
			distanceToChest = distanceToChest - 5;
		} else if (wCount >= eCount) {
			distanceToChest = distanceToChest + 5;
		}
		if (distanceToChest == 0) {
			return "Well done you have found the treasure";
		}

		
		return "";
	}

	public String moveEast() {

		eCount = eCount + 1;
		if (eCount < wCount) {
			distanceToChest = distanceToChest - 5;
		} else if (eCount >= wCount) {
			distanceToChest = distanceToChest + 5;
		}

		if (distanceToChest == 0) {
			return "Well done you have found the treasure";
		}

		else if (distanceToChest != 0) {
			return "The distance to the chest = " + distanceToChest;
		}
		return "";
	}

	public String moveNorth() {

		nCount = nCount + 1;
		if (nCount < sCount) {
			distanceToChest = distanceToChest - 5;
		} else if (nCount >= sCount + 4) {
			distanceToChest = distanceToChest + 5;
		}
		if (distanceToChest == 0) {
			return "Well done you have found the treasure";
		}

		else if (distanceToChest != 0) {
			return "The distance to the chest = " + distanceToChest;
		}
		return "";

	}

	public String moveSouth() {

		sCount = sCount + 1;
		if (sCount < nCount) {
			distanceToChest = distanceToChest - 5;
		} else if (sCount >= nCount) {
			distanceToChest = distanceToChest + 5;
		}
		if (distanceToChest == 0) {
			return "Well done you have found the treasure";
		}

		else if (distanceToChest != 0) {
			return "The distance to the chest = " + distanceToChest;
		}
		return "";

	}

}
