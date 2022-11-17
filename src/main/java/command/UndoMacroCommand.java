package command;

import java.util.Arrays;

public class UndoMacroCommand implements Command {

  private final Command[] commands;

  public UndoMacroCommand(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    Arrays.stream(commands)
          .forEach(Command::undo);
  }

  @Override
  public void undo() {
    Arrays.stream(commands)
          .forEach(Command::execute);
  }

}
