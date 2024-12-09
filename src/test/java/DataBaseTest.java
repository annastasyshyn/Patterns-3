
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.database.Database;

import static org.junit.jupiter.api.Assertions.*;

public class DataBaseTest {

    @Test
    public void testGetUserData() {
        Database db = new Database();
        String result = db.getUserData();
        assertEquals("hello", result);
    }

    @Test
    public void testGetStatisticalData() {
        Database db = new Database();
        String result = db.getStatisticalData();
        assertEquals("hello2", result);
    }
}
