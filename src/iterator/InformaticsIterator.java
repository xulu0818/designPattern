package iterator;

import java.util.Iterator;
import java.util.List;

public class InformaticsIterator implements Iterator{

    public List<Major> informaticsMajorList;
    public int pointer = 0;

    public InformaticsIterator(List<Major> informaticsMajorList) {
        this.informaticsMajorList = informaticsMajorList;
    }
    @Override
    public boolean hasNext() {
        return pointer != informaticsMajorList.size();
    }

    @Override
    public Major next() {
        if (pointer < informaticsMajorList.size()) {
            Major currentMajor = informaticsMajorList.get(pointer++);
            return currentMajor;
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
