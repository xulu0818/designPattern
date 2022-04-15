package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Program> programList = new ArrayList<>();

        Program computerProgram = new ComputerProgram();
        Major cs = new Major("cs", "computer science");
        Major ai = new Major("ai", "artificial intelligence");
        computerProgram.addMajor(cs);
        computerProgram.addMajor(ai);
        programList.add(computerProgram);
        Iterator computerIterator = computerProgram.createIterator();

        Program informaticsProgram = new InformaticsProgram();
        Major info = new Major("info", "informatics");
        Major data = new Major("data", "data science");
        informaticsProgram.addMajor(info);
        informaticsProgram.addMajor(data);
        programList.add(informaticsProgram);
        Iterator infoIterator = informaticsProgram.createIterator();

        Output outputHelper = new Output(programList);
        outputHelper.printProgram();
        outputHelper.printMajor(computerIterator);
        outputHelper.printMajor(infoIterator);


    }
}
