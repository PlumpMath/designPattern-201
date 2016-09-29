package designPattern.test.factory.abstractFactory.creator;

import designPattern.test.factory.abstractFactory.product.NYCheesePizza;
import designPattern.test.factory.abstractFactory.product.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			pizza = new NYCheesePizza();
		}
		return null;
	}

}
