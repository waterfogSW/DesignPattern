package test_2022_10_06;

import java.util.ArrayList;
import java.util.List;

public abstract class CellObserver {

  List<Cell> cells = new ArrayList<>();

  public void addCell(Cell cell) {
    cells.add(cell);
  }

  public void removeCell(Cell cell) {
    cells.remove(cell);
  }

  public void updateAll() {
    for (Cell cell : cells) {
      cell.update();
    }
  }

  abstract void update();

}
