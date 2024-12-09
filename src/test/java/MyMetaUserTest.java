import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.message.meta.FaceBookUser;
import ua.edu.ucu.apps.message.user.MyMetaUser;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MyMetaUserTest {

    @Test
    public void testGetEmail() {
        FaceBookUser fbUser = new FaceBookUser("test@example.com", "USA", LocalDate.of(2023, 10, 1));
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("test@example.com", myMetaUser.getEmail());
    }

    @Test
    public void testGetCountry() {
        FaceBookUser fbUser = new FaceBookUser("test@example.com", "USA", LocalDate.of(2023, 10, 1));
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("USA", myMetaUser.getCountry());
    }

    @Test
    public void testGetActiveTime() {
        FaceBookUser fbUser = new FaceBookUser("test@example.com", "USA", LocalDate.of(2023, 10, 1));
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals(LocalDate.of(2023, 10, 1), myMetaUser.getActiveTime());
    }
}