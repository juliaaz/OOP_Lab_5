package flowers;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

@Getter @Setter
public class Store{
    private int amount_flowers;
    private int amount_roses, amount_tulip, amount_chamomile;
    private List<Flower> assortment = new ArrayList<Flower>();
    public Store(){
        this.amount_flowers = 0;
        this.amount_roses = 0;
        this.amount_tulip = 0;
        this.amount_chamomile = 0;
    }

    public void generateAssortment(){
        String[] random_color = {"Red","Yellow","Blue"};
        FlowerType[] flowerTypes =
                {FlowerType.ROSE, FlowerType.TULIP, FlowerType.CHAMOMILE};
        while(this.amount_flowers < 50) {
            Random random = new Random();
            int number_Rose = (random.nextInt(5) + 2);
            int number_Tulip = (random.nextInt(5) + 2);
            int number_Chamomile = (random.nextInt(5) + 2);
            for (int i = 0; i < number_Rose; i++) {
                Flower Rose = new Flower(FlowerType.ROSE);
                Rose.setPrice(random.nextInt(10) + 11);
                int idx_color = random.nextInt(random_color.length);
                Rose.setColor(random_color[idx_color]);
                Rose.setSepalLength(random.nextInt(30));
                this.amount_flowers += 1;
                assortment.add(Rose);
            }
            for (int j = 0; j < number_Tulip; j++) {
                Flower Tulip = new Flower(FlowerType.TULIP);
                Tulip.setPrice(random.nextInt(10) + 11);
                int idx_color = random.nextInt(random_color.length);
                Tulip.setColor(random_color[idx_color]);
                Tulip.setSepalLength(random.nextInt(30));
                this.amount_flowers += 1;
                assortment.add(Tulip);
            }
            for (int k = 0; k < number_Chamomile; k++) {
                Flower Chamomile = new Flower(FlowerType.CHAMOMILE);
                Chamomile.setPrice(random.nextInt(10) + 11);
                int idx_color = random.nextInt(random_color.length);
                Chamomile.setColor(random_color[idx_color]);
                Chamomile.setSepalLength(random.nextInt(30));
                this.amount_flowers += 1;
                assortment.add(Chamomile);
            }
        }
    }

    public void search(int needed_price){
        List<Flower> bucket_flowers = new ArrayList<Flower>();
        int bucket_price = 0;
        FlowerBucket bucket = new FlowerBucket();
        while(bucket_price < needed_price){
            Random random = new Random();
            int random_index = random.nextInt(assortment.size());
            Flower randomized_flower = assortment.get(random_index);
            bucket_flowers.add(randomized_flower);
            bucket_price += randomized_flower.getPrice();

            assortment.remove(random_index);
            FlowerPack pack = new FlowerPack();
            pack.setAmount(1);
            pack.setFlower(randomized_flower);
            if (randomized_flower.getFlowerType() == FlowerType.ROSE){
                this.amount_roses += 1;
            }
            else if(randomized_flower.getFlowerType() == FlowerType.TULIP)
            {this.amount_tulip += 1;}
            else {this.amount_chamomile += 1;}
        }
        System.out.println("Congratulations! Here is your bucket for " + needed_price + " hryvnias");
        System.out.println("Number of Roses: " + this.amount_roses);
        System.out.println("Number of Tulips: " + this.amount_tulip);
        System.out.println("Number of Chamomiles: " + this.amount_chamomile);
        System.out.println("Here is your bucket:");
        System.out.println(bucket_flowers);
//        return (Item) bucket_flowers;
    }

}
