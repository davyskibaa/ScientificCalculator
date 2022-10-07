public class QuadraticEquation {
    private double x, x1, x2;
    private String output;

    public void counting(double a, double b, double c) {
        if (a == 0 || b == 0) {
            throw new IllegalCoefficientException("The equation is not quadratic");
        }
        if (c == 0) {
            x1 =  0;
            x2 = -b;
        }
        else {
            double discr = Math.sqrt(b * b - 4 * a * c);
            if (discr == 0) {
                x = -b / (2 * a);
            }
            else if(discr > 0) {
                x1 = (-b + discr) / (2 * a);
                x2 = (-b - discr) / (2 * a);
            }
            else {
                output = "No roots";
            }
        }
    }

    public void printSolutions() {
        if (x != 0) {
            System.out.print("The equation has solution: " + x);
        }
        else if (x1 != 0 || x2 != 0) {
            System.out.print("The equation has solutions: x1 = " + x1 + ", x2 = " + x2);
        }
        else {
            System.out.print(output);
        }

    }

    public double getX() {
        return x;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public String getOutput() {
        return output;
    }
}
