package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack implements Item{
    String descriptionStr = "";
    public FlowerPack(){
        this.descriptionStr = "";
    }
    public Flower getFlower() {
        return flower;
    }

    private Flower flower;
    private int amount;

    public double getPrice() {
        return amount * flower.getPrice();
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
        this.descriptionStr += flower.getDescription();
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription(){
        return flower.toString();
    }
}

