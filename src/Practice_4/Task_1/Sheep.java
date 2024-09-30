package Practice_4.Task_1;

public class Sheep extends Animal implements Movable {
    public Sheep(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        return this._age * 5;
    }

    @Override
    public void move() {
        System.out.println("Овца двигается");
    }
}
