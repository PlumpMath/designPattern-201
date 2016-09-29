package designPattern.test.strategy.behavior.impl;

import designPattern.test.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak ! ");
	}

}
