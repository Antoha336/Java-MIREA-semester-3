package Task_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(5, 30);
        Sheep sheep = new Sheep(3, 20);

        System.out.println("Возраст собаки: " + dog.toHumanAge());
        System.out.println("Возраст овцы: " + sheep.toHumanAge());

        System.out.println("Движение животных:");
        dog.move();
        sheep.move();
    }
}

