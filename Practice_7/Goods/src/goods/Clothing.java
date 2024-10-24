package goods;

public class Clothing {
    private String name;
    private int quantity;

    public Clothing(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int amount) {
        this.quantity += amount;
    }
}
