package flyweight;

public class ConcreteWebsite extends Website {
    public String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }


    public void use(User user) {
        System.out.println("use " + type + " website, the user is " + user.name);
    }

}
