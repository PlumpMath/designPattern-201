package designPattern.test.composite;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent panecakeHouseMenu = new Menu("PANCAKE House Menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");

		MenuComponent allMenu = new Menu("ALL MENUS", "A menus combined!");

		allMenu.add(dinerMenu);
		allMenu.add(panecakeHouseMenu);
		allMenu.add(cafeMenu);

		dinerMenu.add(new MenuItem("Pasta", "Spahetti with Marinara", 3.89, true));

		Waitress waitress = new Waitress(allMenu);
//		waitress.printMenu();
		
		waitress.printVegetraianMenu();
	}
}
