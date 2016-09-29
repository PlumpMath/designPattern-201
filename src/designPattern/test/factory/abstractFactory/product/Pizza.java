package designPattern.test.factory.abstractFactory.product;

public abstract class Pizza {
	String name;

	public void cook() {
		System.out.println("I am " + name + " pizza");
	}
}
