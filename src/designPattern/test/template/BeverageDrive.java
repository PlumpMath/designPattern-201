package designPattern.test.template;

public class BeverageDrive {
	public static void main(String[] args) {
		CaffeineBeverageWithHook coffee = new CoffeeWithHook();
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
	}
}
