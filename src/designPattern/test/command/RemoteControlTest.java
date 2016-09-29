package designPattern.test.command;

import designPattern.test.command.Receiver.Light;
import designPattern.test.command.command.LightOnCommend;
import designPattern.test.command.invoke.SimpleRemoteControl;

/**
 * I am a client
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		
		LightOnCommend lightOnCommend = new LightOnCommend(light);
		remoteControl.setCommand(lightOnCommend);
		remoteControl.buttonWasPressed();
	}
}
