package command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);


        RemoterController remoterController = new RemoterController();
        remoterController.setCommands(0, lightOnCommand, lightOffCommand);

        System.out.println("press light on button");
        remoterController.onButtonWasPushed(0);

        System.out.println("press light off button");
        remoterController.offButtonWasPushed(0);
        System.out.println("press undo button");
        remoterController.undoButtonWasPushed(0);
    }


}
