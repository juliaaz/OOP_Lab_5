package decorator;
import flowers.Item;

public class BucketDecorator extends Decorator{
    public BucketDecorator(Item item){
        super(item);
    }
    @Override
    public double getPrice(){
        return super.getPrice() + 4;
    }
}
