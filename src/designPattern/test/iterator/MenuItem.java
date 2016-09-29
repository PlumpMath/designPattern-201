package designPattern.test.iterator;

public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public final String getName() {
		return name;
	}

	public final String getDescription() {
		return description;
	}

	public final boolean isVegetarian() {
		return vegetarian;
	}

	public final double getPrice() {
		return price;
	}

}
