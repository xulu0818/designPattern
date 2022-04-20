package memento;

/**
 * manage current state memento
 * save current memento
 * like the platform for sims4, select current game version
 * current originator --> latest memento
 * the memento looks like a linked list
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento() {
        System.out.println("new version saved: " + state);
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
