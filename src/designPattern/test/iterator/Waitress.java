package designPattern.test.iterator;

import java.util.Iterator;

public class Waitress {
	Menu dinerMenu;

	public Waitress(Menu dinerMenu) {
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem.getName() + "," + menuItem.getPrice() + "--" + menuItem.getDescription());
		}
	}

}
