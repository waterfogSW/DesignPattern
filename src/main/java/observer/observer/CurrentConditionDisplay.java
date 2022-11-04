package observer.observer;

import observer.dataobject.WeatherData;

public class CurrentConditionDisplay implements DisplayObserver {

  private float temperature;
  private float humidity;
  private final WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  @Override
  public void display() {
    System.out.println(
        "Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }

}
