package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList;

    public Caretaker() {
        mementoList = new ArrayList<>();
    }

    public void add(Memento newMemento) {
        mementoList.add(newMemento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
