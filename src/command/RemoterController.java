package command;

public class RemoterController {
    public Command[] onCommands;
    public Command[] offCommands;

    // keep track of the previous command
    Command undoCommand;

    public RemoterController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonWasPushed(int button) {
        onCommands[button].execute();
        undoCommand = onCommands[button];
    }

    public void offButtonWasPushed(int button) {
        offCommands[button].execute();
        undoCommand = offCommands[button];
    }

    public void undoButtonWasPushed(int button) {
        undoCommand.undo();
    }
}
