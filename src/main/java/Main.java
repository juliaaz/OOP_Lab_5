import flowers.*;
import delivery.*;
import decorator.*;
import payment.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Store store  = new Store();
    public static void main(String[] args) {
        double price;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привіт");
        store.generateAssortment();
        ArrayList<Item> order = new ArrayList<>();
        System.out.println("Choose a price for a bucket in JuStore:");
        Integer bucket_price = scanner.nextInt();
        store.search(bucket_price);
        Flower flower = new Flower(FlowerType.CHAMOMILE);
        flower.setColor("Blue");
        flower.setPrice(15);
        flower.setSepalLength(17);
        System.out.println("What you want to decorate:");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bucket, Paper, Ribbon");
        String str = scanner2.nextLine();
        if(str.equals("Bucket")){
            BucketDecorator bucketDec = new BucketDecorator(flower);
            price = bucketDec.getPrice() + bucket_price;
            order.add(bucketDec);
        }
        else if(str.equals("Paper")){
            PaperDecorator paperDec = new PaperDecorator(flower);
            price = paperDec.getPrice() + bucket_price;
            order.add(paperDec);
        }
        else{
            RibbonDecorator ribbonDec = new RibbonDecorator(flower);
            price = ribbonDec.getPrice() + bucket_price;
            order.add(ribbonDec);
        }
        System.out.println("Great! Your total is: " + price);
        System.out.println("How do you want to pay?");
        System.out.println("Credit Card, PayPal");
        String str2 = scanner2.nextLine();
        if(str2.equals("Credit Card")){
            CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
            payment.pay(price);
        }
        else{
            PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
            payment.pay(price);
        }
        System.out.println("Select delivery method");
        System.out.println("DHL, Post");
        String str3 = scanner2.nextLine();
        if(str3.equals("DHL")){
            DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
            delivery.deliver(order);
        }
        else{
            PostDeliverStrategy delivery = new PostDeliverStrategy();
            delivery.deliver(order);
        }
        System.out.print("Папа");
    }
}
