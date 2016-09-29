package designPattern.test.factory.factoryMethod.product.group;

public class PlumTomatoSauce extends Sauce {
	public PlumTomatoSauce() {
		name = "Plum Tomato";
	}

	@Override
	public void useSauce() {
		System.out.println("Use " + name + " Sauce!");
	}

}
