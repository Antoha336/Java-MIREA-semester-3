package Task;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");
        image.display();
        image.display();
    }
}
