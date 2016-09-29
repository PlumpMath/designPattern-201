package designPattern.test.observer.observer;

import java.util.Observable;
import java.util.Observer;

import designPattern.test.observer.subject.WeatherData;

public class CurrnetCoditionDisPlay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	@SuppressWarnings("unused")
	private Observable observable;

	public CurrnetCoditionDisPlay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println(String.format("CurrentCondition : The temperature is %s , humidity is %s , pressure is %s",
				temperature, humidity, pressure));

	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

}
