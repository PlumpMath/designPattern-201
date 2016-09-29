package designPattern.test.strategy.behavior.impl;

import designPattern.test.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can`t fly ! ");
	}

}
