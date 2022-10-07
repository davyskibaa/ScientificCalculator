public class LinearEquation {

    private double x;

    public void count(double a, double b) {
        x = (-(b / a));
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
