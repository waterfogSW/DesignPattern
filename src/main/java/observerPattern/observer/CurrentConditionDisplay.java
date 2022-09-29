package observerPattern.observer;

import observerPattern.dataobject.DataObject;

public class CurrentConditionDisplay implements DisplayObserver {

  private final DataObject weatherData;

  public CurrentConditionDisplay(DataObject weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void update() {
    ccDisplay();
  }

  private void ccDisplay() {
    System.out.println("I am Current Condition Display");
  }

}
