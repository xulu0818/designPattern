package command;

public class LightOffCommand implements Command {
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }

    @Override
    public void undo() {
        light.turnOnLight();
    }
}
