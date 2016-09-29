package designPattern.test.factory.factoryMethod.factory;

import designPattern.test.factory.factoryMethod.product.group.Dough;
import designPattern.test.factory.factoryMethod.product.group.Sauce;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();
}
