package proxy.staticProxy;

public class Teacher implements ITeacher {

    @Override
    public void teach() {
        System.out.println("teacher start teaching");
    }
}
