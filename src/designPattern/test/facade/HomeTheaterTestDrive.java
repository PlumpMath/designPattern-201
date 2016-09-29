package designPattern.test.facade;

import designPattern.test.facade.subSystem.CdPlayer;
import designPattern.test.facade.subSystem.Light;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		HomeThreaterFacade homeThreaterFacade = new HomeThreaterFacade(new Light(), new CdPlayer());
		homeThreaterFacade.watchMovie();
		homeThreaterFacade.endMovie();
	}
}
