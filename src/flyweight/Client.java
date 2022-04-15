package flyweight;

public class Client {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        User user1 = new User("tim");
        User user2 = new User("tom");

        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website cnn = websiteFactory.getConcreteWebsite("CNN");
        cnn.use(user1);

        Website tweeter = websiteFactory.getConcreteWebsite("Tweeter");
        tweeter.use(user2);

    }
}
