package observerPattern.observer;

import observerPattern.dataobject.DataObject;

public class StatisticDisplay implements DisplayObserver {

  private final DataObject weatherData;

  public StatisticDisplay(DataObject weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    sDisplay();
  }

  private void sDisplay() {
    System.out.println("I am Statistic Display");
  }

}
