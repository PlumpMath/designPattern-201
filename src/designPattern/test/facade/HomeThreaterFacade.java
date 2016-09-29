package designPattern.test.facade;

import designPattern.test.facade.subSystem.CdPlayer;
import designPattern.test.facade.subSystem.Light;

public class HomeThreaterFacade {
	private Light light;
	private CdPlayer cdPlayer;

	public HomeThreaterFacade(Light light, CdPlayer cdPlayer) {
		super();
		this.light = light;
		this.cdPlayer = cdPlayer;
	}

	public void watchMovie() {
		light.off();
		cdPlayer.play();
	}

	public void endMovie() {
		cdPlayer.shutdown();
		light.on();
	}
}
