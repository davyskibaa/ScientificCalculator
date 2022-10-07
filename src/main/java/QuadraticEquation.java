public class QuadraticEquation {
    private double x1, x2;

    public void counting(double a, double b, double c) {
        double discr = Math.sqrt(b * b - 4 * a * c);
            x1 = (-b + discr) / (2 * a);
            x2 = (-b - discr) / (2 * a);
    }

    public void printSolutions() {
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}

