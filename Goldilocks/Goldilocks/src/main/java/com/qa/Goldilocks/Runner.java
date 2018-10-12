package com.qa.Goldilocks;

public class Runner {

	public static void main(String[] args) {

		SitDown NewList = new SitDown();

		Chairs a1 = new Chairs(297);
		Chairs a2 = new Chairs(110);
		Chairs a3 = new Chairs(257);
		Chairs a4 = new Chairs(276);
		Chairs a5 = new Chairs(16);
		Porridge b1 = new Porridge(110);
		Porridge b2 = new Porridge(90);
		Porridge b3 = new Porridge(70);
		Porridge b4 = new Porridge(113);
		Porridge b5 = new Porridge(40);
		Light c1 = new Light(54);
		Light c2 = new Light(78);
		Light c3 = new Light(98);
		Light c4 = new Light(12);
		Light c5 = new Light(22);

		NewList.addChair(a1);
		NewList.addChair(a2);
		NewList.addChair(a3);
		NewList.addChair(a4);
		NewList.addChair(a5);
		NewList.addPorridge(b1);
		NewList.addPorridge(b2);
		NewList.addPorridge(b3);
		NewList.addPorridge(b4);
		NewList.addPorridge(b5);
		NewList.addLight(c1);
		NewList.addLight(c2);
		NewList.addLight(c3);
		NewList.addLight(c4);
		NewList.addLight(c5);

		System.out.println(NewList.sitDown(NewList.ChairList, NewList.LightList, NewList.PorridgeList, 100, 100));

	}

}
