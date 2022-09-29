package observerPattern.observer;

import observerPattern.dataobject.DataObject;

public class ForecastDisplay implements DisplayObserver {

  private final DataObject weatherData;

  public ForecastDisplay(DataObject weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    fDisplay();
  }

  private void fDisplay() {
    System.out.println("I am Forcast Display");
  }

}
