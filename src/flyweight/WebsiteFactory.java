package flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
    public Map<String, Website> websites = new HashMap<>();

    public Website getConcreteWebsite(String type) {
        Website currentWebsite = null;
        if (websites.containsKey(type)) {
            currentWebsite = websites.get(type);
        } else {
            currentWebsite = new ConcreteWebsite(type);
            websites.put(type, currentWebsite);
        }
        return (Website)currentWebsite;
    }
}
