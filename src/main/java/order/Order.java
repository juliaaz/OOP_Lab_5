package order;
import delivery.Delivery;
import flowers.Item;
import payment.Payment;
import users.*;
import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<User> users = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double total = 0;
        for(Item item: this.items){
            total += item.getPrice();
        }
        return total;
    }

    public void processCustomerOrder(){
        double orderPrice = calculateTotal();
        if (payment.pay(orderPrice)){
            delivery.deliver(items);
        }
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void notifyUsers(){
        for(User user: users) {
            user.update("User notification");
        }
    }

    public void order(){
        notifyUsers();
    }

    public String processOrder(){
        return "Your order is being processed, wait a little";
    }
}
