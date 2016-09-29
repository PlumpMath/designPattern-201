package designPattern.test.singleton;

public class ChocolateBoilder {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoilder chocolateBoilder;

	private ChocolateBoilder() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoilder getInstance() {
		if (null == chocolateBoilder) {
			synchronized (ChocolateBoilder.class) {
				if (null == chocolateBoilder) {
					chocolateBoilder = new ChocolateBoilder();
				}
			}
		}
		return chocolateBoilder;
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
