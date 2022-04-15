package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InformaticsProgram implements Program {
    public List<Major> informaticsMajorList = new ArrayList<>();


    @Override
    public void addMajor(Major newMajor) {
        informaticsMajorList.add(newMajor);
    }

    @Override
    public String getName() {
        return "Informatics program";
    }

    @Override
    public Iterator createIterator() {
        return new InformaticsIterator(informaticsMajorList);
    }
}
