package iterator;

import java.util.Iterator;
import java.util.List;

public class Output {
    public List<Program> programList;

    public Output(List<Program> programList) {
        this.programList = programList;
    }

    public void printProgram() {
        // use the default ArrayList Iterator
        Iterator programIterator = programList.iterator();
        while (programIterator.hasNext()) {
            Program currentProgram = (Program) programIterator.next();
            System.out.println(currentProgram.getName());
        }
    }

    public void printMajor(Iterator majorIterator) {
        while (majorIterator.hasNext()) {
            Major currentMajor = (Major) majorIterator.next();
            System.out.println(currentMajor.getName());
        }
    }
}
