package observer.observer;

import observer.dataobject.WeatherData;

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
    float temperature = weatherData.getTemperature();
    tempSum += temperature;
    numReadings++;

    if (temperature > maxTemp) {
      maxTemp = temperature;
    }

    if(temperature < minTemp) {
      minTemp = temperature;
    }

    display();
  }

  public void display() {
    System.out.println("Avg / Max / Min : " + (tempSum / numReadings) + " / " + maxTemp + " / " + minTemp);
  }

}
