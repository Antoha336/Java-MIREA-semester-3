package Practice_4.Task_2;

class Solver extends QuadrEquation {
    public Solver(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void solve() {
        if (a == 0) {
            System.out.println("Это не квадратное уравнение (A не может быть равно 0).");
            return;
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнение имеет два корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        } else {
            System.out.println("Не имеет действительных корней");
        }
    }
}

