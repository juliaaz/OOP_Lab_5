package decorator;
import flowers.Item;

public abstract class Decorator implements Item{
    private final Item item;
    public Decorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
