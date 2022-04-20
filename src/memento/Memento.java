package memento;

/**
 * actual previous state
 * for example: sims saved history
 * each state, each memento
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
