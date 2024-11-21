package Task;

class SimulationThread extends Thread {
    private FallingObject object;

    public SimulationThread(FallingObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        double deltaTime = 0.1;
        while (!object.updatePosition(deltaTime)) {
            try {
                Thread.sleep((int)(deltaTime * 1000));
                System.out.println("Текущая высота: " + Main.round(object.getDistance(), 2) + " м.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Падение завершено. Время: " + Main.round(object.getTime(), 2) + " сек.");

    }
}