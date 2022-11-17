package command;

public class HottubOnCommand implements Command {

  Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.on();
    hottub.heat();
    hottub.bubblesOn();
  }

  @Override
  public void undo() {
    hottub.off();
    hottub.cool();
    hottub.bubblesOff();
  }

}
