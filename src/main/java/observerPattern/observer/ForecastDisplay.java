package observerPattern.observer;

import observerPattern.dataobject.WeatherData;

public class ForecastDisplay implements DisplayObserver {

  private final WeatherData weatherData;

  private float lastPressure = 0f;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    float currentPressure = weatherData.getPressure();

    System.out.print("Forcast : ");
    if (currentPressure > lastPressure) {
      System.out.println("improve");
    } else if (currentPressure < lastPressure) {
      System.out.println("degree");
    } else {
      System.out.println("same");
    }
  }

  private void fDisplay() {
    System.out.println("I am Forcast Display");
  }

}
