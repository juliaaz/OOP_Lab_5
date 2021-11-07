package order;
import delivery.*;
import flowers.*;
import payment.Payment;
import users.*;
import payment.*;

public enum FastOrderConstructor {
    ROSE_BUCKET, TULIP_BUCKET, CHAMOMILE_BUCKET;
    public static Order createOrder(FastOrderConstructor constructor) {
        Item bucket = new FlowerBucket();
        FlowerPack flower_pack = new FlowerPack();
        Item flower;
        Order order = new Order();
        Receiver receiver = new Receiver();
        Sender sender = new Sender();
        Payment payment = new PayPalPaymentStrategy();
        Delivery delivery = new PostDeliverStrategy();
        if (constructor == FastOrderConstructor.TULIP_BUCKET) {
            flower = new Flower(FlowerType.TULIP);
            ((Flower) flower).setPrice(13);
        }
        else if (constructor == FastOrderConstructor.CHAMOMILE_BUCKET) {
            flower = new Flower(FlowerType.CHAMOMILE);
            ((Flower) flower).setPrice(15);
        }
        else if (constructor == FastOrderConstructor.ROSE_BUCKET)
        {
            flower = new Flower(FlowerType.ROSE);
            ((Flower) flower).setPrice(17);
        }
        else {
            System.out.println("The Flower is not available in the store. Sorry");
            return order;
        }
        flower_pack.setFlower((Flower) flower);
        flower_pack.setAmount(5);
        ((FlowerBucket) bucket).addPack(flower_pack);
        order.addItem(bucket);
        order.addUser(receiver);
        order.addUser(sender);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);
        return order;
    }
}
