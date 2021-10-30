package flowers;

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;
@ToString
public class FlowerBucket implements Item{
    String descriptionStr = "";
    public List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public FlowerBucket(){
        this.descriptionStr = "Flower Bucket: ";
    }
    public void addPack(FlowerPack flowerPack){
        flowerPackList.add(flowerPack);
        this.descriptionStr += flowerPack.descriptionStr + ", ";

    }
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public String getDescription(){
        return this.descriptionStr.toString();
    }
}
