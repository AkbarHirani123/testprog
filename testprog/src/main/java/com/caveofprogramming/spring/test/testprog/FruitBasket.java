package com.caveofprogramming.spring.test.testprog;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> fruits;

	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		String n = "";
		for (String f : fruits)
			n += f + "\n";
		return "FruitBasket [name=" + name + " contains fruits=" + n + "]";
	}

}
