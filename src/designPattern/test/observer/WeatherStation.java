package designPattern.test.observer;

import designPattern.test.observer.observer.CurrnetCoditionDisPlay;
import designPattern.test.observer.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		@SuppressWarnings("unused")
		CurrnetCoditionDisPlay currnetCoditionDisPlay = new CurrnetCoditionDisPlay(weatherData);
		// Start!
		weatherData.setMessurements(80, 65, 30.4f);
		weatherData.setMessurements(82, 70, 29.2f);
		weatherData.setMessurements(78, 90, 29.2f);
	}
}
