package observerPattern.dataobject;

public class WeatherData extends DataObject {

  private float temperature;
  private float humidity;
  private float pressure;

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(
      float temperature,
      float humidity,
      float pressure
  ) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
    measurementsChanged();
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
    measurementsChanged();
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

}
