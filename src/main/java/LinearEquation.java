public class LinearEquation {

    private double x;

    public void count(double a, double b) {
        if (a == 0 && b == 0) {
            throw new IllegalCoefficientException("Every real number is a solution!");
        } else if (a == 0) {
            throw new IllegalCoefficientException("Equation is not solvable!");
        } else {
            x = (-(b / a));
        }
    }

    public void printSolution() {
        if (x != 0) {
            System.out.print("The equation has solution: " + x);
        }
    }

    public double getX() {
        return x;
    }
}
