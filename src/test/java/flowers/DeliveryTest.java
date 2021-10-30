package delivery;
import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class DeliveryTest {
    private DHLDeliveryStrategy dhl;
    private PostDeliverStrategy post;
    private Flower flower1;
    List<Item> toDeliver;
    @BeforeEach
    void setUP(){
        dhl = new DHLDeliveryStrategy();
        toDeliver = new ArrayList<>();
        flower1 = new Flower(FlowerType.ROSE);
        flower1.setPrice(10);
        flower1.setSepalLength(12);
        flower1.setColor("Yellow");
        toDeliver.add(flower1);
    }
    @Test
    void PostDeliver(){
        post = new PostDeliverStrategy();
        assertTrue(post.deliver(toDeliver));
    }

    @Test
    void DHLDeliver(){
        dhl = new DHLDeliveryStrategy();
        assertTrue(dhl.deliver(toDeliver));
    }
}
