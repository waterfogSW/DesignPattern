package command;

public class CeilingFanOnCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    ceilingFan.high();
  }

  @Override
  public void undo() {
    switch (prevSpeed) {
      case CeilingFan.HIGH -> ceilingFan.high();
      case CeilingFan.MEDIUM -> ceilingFan.medium();
      case CeilingFan.LOW -> ceilingFan.low();
      default -> ceilingFan.off();
    }
  }

}
