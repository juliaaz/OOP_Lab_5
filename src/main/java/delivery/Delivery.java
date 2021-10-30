package delivery;
import flowers.Item;
import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
