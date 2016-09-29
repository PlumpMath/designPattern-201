package designPattern.test.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
	private static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "Fakin Bacon with lettuce", true, 2.99);
		addItem("Vaaaaa", "Fuckkkkkkkk", false, 299);
	}

	@Override
	public void addItem(String name, String description, boolean vegetarian, double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry ,menu is full! Can`t add item to menu");
		} else {
			menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
		}

	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
