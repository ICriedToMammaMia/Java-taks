package com.qa.Goldilocks;

public class Chairs extends Position {

	private int weightCapacity;

	public Chairs(int capacity) {
		this.weightCapacity = capacity;
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

}
