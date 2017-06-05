package chat;

/**
 * Created by Justin Huang
 */

public class User {

    private String name, hostName;
    private boolean isOnline;

    public User(String n, String hN, boolean status) {
        name = n;
        hostName = hN;
        isOnline = status;
    }

    public String toString() {
        return name;
    }

}