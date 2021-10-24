package flowers;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerTest {
    private Flower flower;
    @BeforeEach
    void setUP(){
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(30);
        flower.setSepalLength(40);
        flower.setColor("Blue");}

    @Test
    void getPrice(){assertEquals(30, flower.getPrice());}

    @Test
    void getSepalLength(){assertEquals(40, flower.getSepalLength());}

    @Test
    void getColor(){assertEquals("Blue", flower.getColor());}

    @Test
    void getFlowerType(){assertEquals(FlowerType.ROSE, flower.getFlowerType());}
}
