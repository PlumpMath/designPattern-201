package designPattern.test.factory.factoryMethod.factory;

import designPattern.test.factory.factoryMethod.product.group.Dough;
import designPattern.test.factory.factoryMethod.product.group.PlumTomatoSauce;
import designPattern.test.factory.factoryMethod.product.group.Sauce;
import designPattern.test.factory.factoryMethod.product.group.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

}
