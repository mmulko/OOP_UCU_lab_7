package sender;

import Meta.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private final FacebookUser user;

    public MyFacebookUser(FacebookUser user) {
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
