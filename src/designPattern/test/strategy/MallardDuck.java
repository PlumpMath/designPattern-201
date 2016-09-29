package designPattern.test.strategy;

import designPattern.test.strategy.behavior.impl.FlyWithWings;
import designPattern.test.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("I am a real mallard duck !");
	}
	
}
