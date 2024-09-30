package Practice_4.Task_2;

abstract class QuadrEquation {
    protected double a;  // Коэффициент A
    protected double b;  // Коэффициент B
    protected double c;  // Коэффициент C

    public QuadrEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] getCoefficients() {
        return new double[] {a, b, c};
    }

    public abstract void solve();
}

