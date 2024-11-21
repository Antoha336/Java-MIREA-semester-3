package Task;

class FallingObject {
    private double height;
    private double force;
    private double lift;
    private double resistance;
    private double speed = 0;
    private double time = 0;

    public FallingObject(double height, double force, double lift, double resistance) {
        this.height = height;
        this.force = force;
        this.lift = lift;
        this.resistance = resistance;
    }

    public synchronized boolean updatePosition(double deltaTime) {
        double acceleration = force - lift - resistance;
        speed += acceleration * deltaTime;
        height -= speed * deltaTime;
        time += deltaTime;

        return height <= 0;  // возвращает true, если объект достиг земли
    }

    public double getTime() {
        return time;
    }

    public double getDistance() {
        return Math.max(0, height);
    }
}