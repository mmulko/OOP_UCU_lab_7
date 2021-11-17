package sender;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User {
    private final TwitterUser user;

    public MyTwitterUser(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String userMail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String lastActiveTime() {
        return user.getLastActiveTime();
    }
}
