package order;

import decorator.BucketDecorator;
import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest{
    Order order;
    Item bucket = new FlowerBucket();
    FlowerPack pack = new FlowerPack();
    Item flower = new Flower(FlowerType.TULIP);
    @BeforeEach
    void setUp() {
        bucket = new FlowerBucket();
        flower = new Flower(FlowerType.TULIP);
        pack = new FlowerPack();
        order = new Order();
        ((Flower) flower).setPrice(13);
        FlowerPack pack = new FlowerPack();
        pack.setFlower((Flower) flower);
        pack.setAmount(7);
        ((FlowerBucket) bucket).addPack(pack);
        bucket = new BucketDecorator(bucket);
        order.addItem(bucket);
    }
    @Test
    void processOrder() {
        assertEquals("Your order is being processed, wait a little", order.processOrder());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(95, order.calculateTotal());
    }
}
