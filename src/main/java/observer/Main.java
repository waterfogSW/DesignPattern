package observer;

import observer.dataobject.WeatherData;
import observer.observer.CurrentConditionDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticDisplay;

public class Main {

  public static void main(String[] args) {
    final var weatherData = new WeatherData();

    final var currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    final var forecastDisplay = new ForecastDisplay(weatherData);
    final var statisticDisplay = new StatisticDisplay(weatherData);

    weatherData.attach(currentConditionDisplay);
    weatherData.attach(forecastDisplay);
    weatherData.attach(statisticDisplay);

    weatherData.setMeasurements(10.5f, 10, 100);
    weatherData.setMeasurements(18.5f, 20, 90);
    weatherData.setMeasurements(15.2f, 30, 100);
  }
}
