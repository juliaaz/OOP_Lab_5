package users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver flag;
    Receiver receiver1;
    Receiver receiver2;
    Receiver receiver3;

    @BeforeEach
    void setUp() {
        flag = new Receiver();
        receiver1 = new Receiver();
        receiver2 = new Receiver();
    }

    @Test
    void testId() {
        assertEquals(1, receiver1.getId() - flag.getId());
        assertEquals(2, receiver2.getId() - flag.getId());
    }
}