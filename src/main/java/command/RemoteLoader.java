package command;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    GarageDoor garageDoor = new GarageDoor("");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
    GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
    GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

    Command[] ons = new Command[]{livingRoomLightOn, kitchenLightOn, garageDoorUp};
    Command[] offs = new Command[]{livingRoomLightOff, kitchenLightOff, garageDoorDown};

    Command commandsOn = new MacroCommand(ons);
    Command commandsOff = new MacroCommand(offs);
    Command commandsUndoOn = new UndoMacroCommand(ons);
    Command commandsUndoOff = new UndoMacroCommand(offs);

    remoteControl.setCommand(1, commandsOn, commandsOff);
    remoteControl.setCommand(2, commandsUndoOn, commandsUndoOff);


    remoteControl.onButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
  }

}
