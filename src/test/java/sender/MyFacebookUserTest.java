package sender;

import Meta.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    private FacebookUser user;
    private MyFacebookUser newUser;
    @BeforeEach
    void setUp() {
        user = new FacebookUser("test@gmail.com", "Uganda", "17.11.2021");
        newUser = new MyFacebookUser(user);
    }

    @Test
    void userMail() {
        assertEquals("test@gmail.com", newUser.userMail());
    }

    @Test
    void getCountry() {
        assertEquals("Uganda", newUser.getCountry());
    }

    @Test
    void lastActiveTime() {
        assertEquals("17.11.2021", newUser.lastActiveTime());
    }
}