package state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("system in stop state");
        context.setState(this);
    }

    public String toString() {
        return "stop state";
    }
}
