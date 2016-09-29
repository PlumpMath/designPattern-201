package designPattern.test.strategy;

import designPattern.test.strategy.behavior.FlyBehavior;
import designPattern.test.strategy.behavior.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All duck float,even decoys!");
	}
}
