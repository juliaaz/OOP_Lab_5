package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender flag;
    Sender sender1;
    Sender sender2;

    @BeforeEach
    void setUp() {
        flag = new Sender();
        sender1 = new Sender();
        sender2 = new Sender();
    }

    @Test
    void testId() {
        assertEquals(1, sender1.getId() - flag.getId());
        assertEquals(2, sender2.getId() - flag.getId());

    }
}