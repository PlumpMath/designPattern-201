package designPattern.test.factory.factoryMethod.product.group;

public class ThinCrustDough extends Dough {

	public ThinCrustDough() {
		name = "Thin Crust";
	}

	@Override
	public void useDough() {
		System.out.println("Use " + name + " Dough !");
	}

}
