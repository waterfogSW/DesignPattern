package observerPattern.dataobject;

import java.util.ArrayList;
import java.util.List;

import observerPattern.observer.DisplayObserver;

public abstract class DataObject {

  private final List<DisplayObserver> displayObservers = new ArrayList<>();

  public void attach(DisplayObserver displayObserver) {
    displayObservers.add(displayObserver);
  }


  public void detach(DisplayObserver displayObserver) {
    displayObservers.remove(displayObserver);
  }

  void notifyObservers() {
    displayObservers.forEach(DisplayObserver::update);
  }

}
