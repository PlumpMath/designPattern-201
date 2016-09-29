package designPattern.test.strategy.behavior.impl;

import designPattern.test.strategy.behavior.QuackBehavior;

public class MutuQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
