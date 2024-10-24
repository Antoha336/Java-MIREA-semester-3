package manager;

import goods.*;

public class Manager {
    private final Electronics electronics;
    private final Clothing clothing;
    private final Food food;

    public Manager() {
        electronics = new Electronics("Electronic", 0);
        clothing = new Clothing("Clothing", 0);
        food = new Food("Food", 0);
    }

    public void changeGoodsAmount(String category, int amount) {
        if (category.equalsIgnoreCase("electronics")) {
            System.out.println("Old electronics amount: " + electronics.getQuantity());
            electronics.changeQuantity(amount);
            System.out.println("New electronics amount: " + electronics.getQuantity());
        }
        else if (category.equalsIgnoreCase("clothing")) {
            System.out.println("Old clothing amount: " + clothing.getQuantity());
            clothing.changeQuantity(amount);
            System.out.println("New clothing amount: " + clothing.getQuantity());
        }
        else if (category.equalsIgnoreCase("food")) {
            System.out.println("Old food amount: " + food.getQuantity());
            food.changeQuantity(amount);
            System.out.println("New food amount: " + food.getQuantity());
        }
        else {
            System.out.println("Category not found");
        }
    }

    public void showGoodsAmount() {
        System.out.println("Electronics amount: " + electronics.getQuantity());
        System.out.println("Clothing amount: " + clothing.getQuantity());
        System.out.println("Food amount: " + food.getQuantity());
    }
}
