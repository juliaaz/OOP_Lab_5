package delivery;
import flowers.Item;
import java.util.List;
public class DHLDeliveryStrategy implements Delivery{
    public boolean deliver(List<Item> items) {
        System.out.println("Next item(s) will be delivered by DHL: ");
        for(Item item: items){
            System.out.println(item.getDescription() + " and Your bucket above");
        }
        return true;
    }
}
