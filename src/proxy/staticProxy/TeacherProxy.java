package proxy.staticProxy;

public class TeacherProxy implements ITeacher {
    private Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("start proxying, complete some other work");
        teacher.teach();
        System.out.println("complete teaching from proxy teacher");
    }
}
