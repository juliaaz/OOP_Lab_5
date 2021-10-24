package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String toString(){
        return getFlowerType().name() + " " + this.color;
    }
}