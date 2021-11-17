package new_analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private Database db;
    @BeforeEach
    void setUp() {
        db = new Database();
    }

    @Test
    void getUserData() {
        assertEquals("hello", db.getUserData());
    }

    @Test
    void getStatisticsData() {
        assertEquals("hello2", db.getStatisticsData());
    }
}