package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComputerProgram implements Program{
    public List<Major> computerMajorList = new ArrayList<>();

    @Override
    public void addMajor(Major newMajor) {
        computerMajorList.add(newMajor);
    }

    @Override
    public String getName() {
        return "computer program";
    }

    @Override
    public Iterator createIterator() {
        return new ComputerIterator(computerMajorList);
    }
}
