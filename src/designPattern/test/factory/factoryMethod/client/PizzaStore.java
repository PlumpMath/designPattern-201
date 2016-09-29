package designPattern.test.factory.factoryMethod.client;

import designPattern.test.factory.abstractFactory.product.Pizza;

public abstract class PizzaStore {
	Pizza pizza;

	public abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		System.out.println("cook begin ...");
		createPizza(type);
		pizza.cook();
		System.out.println("cook end...");
		System.out.println("give you,sir!");
		return pizza;
	}
}
