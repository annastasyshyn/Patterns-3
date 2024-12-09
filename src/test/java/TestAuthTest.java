import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.edu.ucu.apps.database.Database;
import ua.edu.ucu.apps.database.Auth;
import ua.edu.ucu.apps.database.БазаДаних;


public class TestAuthTest {

    @Test
    public void testAuthenticate() {
        Database db = new Database();
        Auth auth = new Auth();
        boolean result = auth.authenticate(db);
        assertTrue(result);
    }

    @Test
    public void testАвторизуватися() {
        БазаДаних db = new БазаДаних();
        Auth auth = new Auth();
        boolean result = auth.авторизуватися(db);
        assertTrue(result);
    }
}