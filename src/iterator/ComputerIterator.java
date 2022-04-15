package iterator;

import java.util.Iterator;
import java.util.List;

public class ComputerIterator implements Iterator {

    public List<Major> computerMajorList;
    public int pointer = 0;

    public ComputerIterator(List<Major> computerMajorList) {
        this.computerMajorList = computerMajorList;
    }
    @Override
    public boolean hasNext() {
        return pointer != computerMajorList.size();
    }

    @Override
    public Major next() {
        if (pointer < computerMajorList.size()) {
            Major currentMajor = computerMajorList.get(pointer++);
            return currentMajor;
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
