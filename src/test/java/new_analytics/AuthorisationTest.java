package new_analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorisationTest {
    private Database db;
    private Authorisation auth;
    @BeforeEach
    void setUp() {
        auth = new Authorisation();
        db = new Database();
    }

    @Test
    void authorise() {
        assertTrue(auth.authorise(db));
    }
}