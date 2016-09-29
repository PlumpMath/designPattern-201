package designPattern.test.composite;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenu;

	public Waitress(MenuComponent menuComponent) {
		super();
		this.allMenu = menuComponent;
	}

	public void printMenu() {
		allMenu.print();
	}

	public void printVegetraianMenu() {
		Iterator<MenuComponent> iterator = allMenu.createIterator();
		System.out.println("\nVegetarian Menu\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (Exception e) {
			}
		}
	}
}
