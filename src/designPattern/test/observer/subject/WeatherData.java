package designPattern.test.observer.subject;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;// �¶�
	private float humidity;// ʪ��
	private float pressure;// ��ѹ

	public void messurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public final float getTemperature() {
		return temperature;
	}

	public final float getHumidity() {
		return humidity;
	}

	public final float getPressure() {
		return pressure;
	}
	
	public void setMessurements(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		messurementsChanged();
	}
}
