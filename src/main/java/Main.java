import flowers.Store;
public class Main {
    private static final Store store  = new Store();
    public static void main(String[] args) {
        System.out.println("Привіт");
        store.generateAssortment();

        store.search(100);
        System.out.println("Папа");
    }
}
