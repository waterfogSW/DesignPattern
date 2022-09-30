package observerPattern;

import observerPattern.dataobject.WeatherData;
import observerPattern.observer.CurrentConditionDisplay;
import observerPattern.observer.ForecastDisplay;
import observerPattern.observer.StatisticDisplay;

public class Main {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

    weatherData.attach(currentConditionDisplay);
    weatherData.attach(forecastDisplay);
    weatherData.attach(statisticDisplay);

    weatherData.setMeasurements(10.5f, 10, 100);
    weatherData.setMeasurements(18.5f, 20, 90);
    weatherData.setMeasurements(15.2f, 30, 100);
  }
}
