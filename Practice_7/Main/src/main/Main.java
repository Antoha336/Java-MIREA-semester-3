package main;

import manager.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.changeGoodsAmount("food", 10);
        manager.changeGoodsAmount("electronics", 5);
        manager.changeGoodsAmount("clothing", 20);
        manager.showGoodsAmount();
        manager.changeGoodsAmount("food", -3);
    }
}
