package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    private TwitterUser user;
    private MyTwitterUser newUser;
    @BeforeEach
    void setUp() {
        user = new TwitterUser("test@gmail.com", "Uganda", "17.11.2021");
        newUser = new MyTwitterUser(user);
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