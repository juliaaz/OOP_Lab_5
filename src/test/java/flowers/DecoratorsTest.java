package decorators;
import flowers.*;
import decorator.BucketDecorator;
import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorsTest {
    private Flower flower, flower2;
    private Item bucketDec, paperDec, ribbonDec;
    @BeforeEach
    void setUP(){
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(30);
        flower.setSepalLength(40);
        flower.setColor("Blue");
        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(10);
        flower2.setSepalLength(12);
        flower2.setColor("Yellow");
    }

    @Test
    void getPriceBucket(){
        bucketDec = new BucketDecorator(flower);
        assertEquals(34, bucketDec.getPrice());
    }

    @Test
    void getPricePaper(){
        paperDec = new PaperDecorator(flower);
        assertEquals(43, paperDec.getPrice());
    }

    @Test
    void getPriceRibbon(){
        ribbonDec = new RibbonDecorator(flower2);
        assertEquals(50, ribbonDec.getPrice());
    }
}
