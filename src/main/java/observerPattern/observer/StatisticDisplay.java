package observerPattern.observer;

import observerPattern.dataobject.DataObject;
import observerPattern.dataobject.WeatherData;

public class StatisticDisplay implements DisplayObserver {

  private final WeatherData weatherData;

  private float tempSum = 0f;
  private float maxTemp = 0.f;
  private float minTemp = 0.f;
  private int numReadings = 0;

  public StatisticDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {

    sDisplay(weatherData.getTemperature());
  }

  private void sDisplay(float temperature) {
    tempSum += temperature;
    numReadings++;

    if (temperature > maxTemp) {
      maxTemp = temperature;
    }

    if(temperature < minTemp) {
      minTemp = temperature;
    }

    System.out.println("Avg / Max / Min : " + (tempSum / numReadings) + " / " + maxTemp + " / " + minTemp);

  }

}
