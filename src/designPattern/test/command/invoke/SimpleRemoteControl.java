package designPattern.test.command.invoke;

import designPattern.test.command.command.Command;

public class SimpleRemoteControl {
	private Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
