package designPattern.test.factory.factoryMethod.product;

import designPattern.test.factory.factoryMethod.product.group.Dough;
import designPattern.test.factory.factoryMethod.product.group.Sauce;

public abstract class Pizza {
	Dough dough;
	Sauce sauce;

	public abstract void prepare();
}
