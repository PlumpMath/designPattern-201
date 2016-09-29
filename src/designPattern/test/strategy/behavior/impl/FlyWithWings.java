package designPattern.test.strategy.behavior.impl;

import designPattern.test.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying !");
	}

}
