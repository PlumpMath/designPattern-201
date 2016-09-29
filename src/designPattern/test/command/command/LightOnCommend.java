package designPattern.test.command.command;

import designPattern.test.command.Receiver.Light;

public class LightOnCommend implements Command {
	Light light;

	public LightOnCommend(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
