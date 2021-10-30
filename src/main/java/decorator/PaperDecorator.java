package decorator;
import flowers.Item;

public class PaperDecorator extends Decorator{
    public PaperDecorator(Item item){
        super(item);
    }
    @Override
    public double getPrice(){
        return super.getPrice() + 13;
    }
}
