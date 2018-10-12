package com.qa.Goldilocks;

public class Light extends Position {

	private int LightValue;

	public Light(int lv) {
		this.LightValue = lv;
	}

	public int getLightValue() {
		return LightValue;
	}

	public void setLightValue(int lightValue) {
		LightValue = lightValue;
	}

}
