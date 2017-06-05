package chat;

/**
 * Created by neworld on 6/5/17.
 * Class that represents a message sent by a DM user.
 */
public class Message {

    private String msg;
    private String sender;
    private String time;

    public Message(String message, String sender, String timeStamp){
        msg = message;
        this.sender = sender;
        time = timeStamp;
    }

    public String getMsg() {
        return msg;
    }

    public String getSender() {
        return sender;
    }

    public String getTime() {
        return time;
    }
}
