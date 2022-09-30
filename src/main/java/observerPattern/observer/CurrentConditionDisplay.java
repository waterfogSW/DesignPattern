package observerPattern.observer;

import observerPattern.dataobject.WeatherData;

public class CurrentConditionDisplay implements DisplayObserver {

  private final WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    float temperature = weatherData.getTemperature();
    float humidity = weatherData.getHumidity();
    ccDisplay(temperature, humidity);
  }

  private void ccDisplay(
      float temperature,
      float humidity
  ) {
    System.out.println(
        "Current Conditions : " + temperature + "C Degree and " + humidity + "% Humidity");
  }

}
