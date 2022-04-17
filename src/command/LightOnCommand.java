package command;

public class LightOnCommand implements Command {
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }

    @Override
    public void undo() {
        light.turnOffLight();
    }
}
