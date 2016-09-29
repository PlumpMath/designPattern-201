package designPattern.test.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Suger and Milk");
	}

	@Override
	boolean customerWantCondiments() {
		String answer = getInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with yout coffee (y/n) ?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.err.println("IO error !");
		}
		if (null == answer) {
			return "no";
		}
		return answer;
	}
}
