package command;

/**
 * empty implement, use it to avoid empty check
 * also a design pattern
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
