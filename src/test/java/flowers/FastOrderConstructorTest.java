package order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {
    Order order;
    @BeforeEach
    void setUp() {
        order = FastOrderConstructor.createOrder(FastOrderConstructor.TULIP_BUCKET);
    }

    @Test
    void createOrder() {
        assertEquals("Your order is being processed, wait a little", order.processOrder());
        assertEquals(65, order.calculateTotal());

        order = FastOrderConstructor.createOrder(FastOrderConstructor.ROSE_BUCKET);
        assertEquals("Your order is being processed, wait a little", order.processOrder());
        assertEquals(85, order.calculateTotal());

        order = FastOrderConstructor.createOrder(FastOrderConstructor.CHAMOMILE_BUCKET);
        assertEquals("Your order is being processed, wait a little", order.processOrder());
        assertEquals(75, order.calculateTotal());
    }
}