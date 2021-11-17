package sender;

import Meta.FacebookUser;
import twitter.TwitterUser;

import java.util.Calendar;

public class MessageSender {
    public boolean send(String text, Object user, String country) {
        if (user instanceof FacebookUser) {
            user = new MyFacebookUser((FacebookUser) user);
            int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            System.out.println("Sent message [" + text + "] to facebook users");
            return true;
        }
        if (user instanceof TwitterUser) {
            user = new MyTwitterUser((TwitterUser) user);
            System.out.println("Sent message [" + text + "] to twitter users");
            return true;
        }
        return false;
    }
}