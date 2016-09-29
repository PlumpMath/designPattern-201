package designPattern.test.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	double price;
	boolean vegetarian;

	public MenuItem(String name, String description, double price, boolean vegetarian) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public final String getName() {
		return name;
	}

	public final String getDescription() {
		return description;
	}

	public final double getPrice() {
		return price;
	}

	public final boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.print("," + getPrice());
		System.out.println("    --" + getDescription());
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}
