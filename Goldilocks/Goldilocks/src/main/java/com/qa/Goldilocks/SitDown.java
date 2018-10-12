package com.qa.Goldilocks;

import java.util.ArrayList;
import java.util.List;

public class SitDown {

	public List<Chairs> ChairList = new ArrayList<Chairs>();
	public List<Light> LightList = new ArrayList<Light>();
	public List<Porridge> PorridgeList = new ArrayList<Porridge>();

	public int sitDown(List<Chairs> weight, List<Light> light, List<Porridge> porridge, int Weight, int Temp) {

		if (weight.size() > 0) {
			for (int i = 0; i < weight.size(); i++) {
				if (weight.get(i).getWeightCapacity() > Weight && light.get(i).getLightValue() > 70
						&& porridge.get(i).getTemp() < Temp) {
					return weight.indexOf(weight.get(i));
				}
			}
		}
		System.out.println("Broken");
		return 0;

	}

	public void addChair(Chairs a) {
		ChairList.add(a);
	}

	public void addLight(Light a) {
		LightList.add(a);
	}

	public void addPorridge(Porridge a) {
		PorridgeList.add(a);
	}

}
