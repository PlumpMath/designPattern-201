package designPattern.test.iterator;

public class MenuTestDrive {
	public static void main(String[] args) {
		Menu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(dinerMenu);
		waitress.printMenu();
	}
}
