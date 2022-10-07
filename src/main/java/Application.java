import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n\nChoose option:\n1. Linear equation\n2. Quadratic equation" +
                    "\n3. System of linear equations\n4. Exit");
            choice = input.nextInt();
            if (choice < 0 || choice > 4) {
                System.out.println("Choose number between 1 and 4!");
                choice = input.nextInt();
            }
            if (choice == 1) {
                double a, b;
                Scanner num1 = new Scanner(System.in);
                System.out.println("Linear equation in standard form: ax + b = 0");
                System.out.println("Enter а: ");
                a = num1.nextDouble();
                System.out.println("Enter b: ");
                b = num1.nextDouble();
                LinearEquation le = new LinearEquation();
                le.count(a, b);
                le.printSolution();
            }
            if (choice == 2) {
                double a, b, c;
                Scanner num2 = new Scanner(System.in);
                System.out.println("Quadratic equation in standard form: ax^2 + bx + c = 0");
                System.out.println("Enter а: ");
                a = num2.nextDouble();
                System.out.println("Enter b: ");
                b = num2.nextDouble();
                System.out.println("Enter с: ");
                c = num2.nextDouble();
                QuadraticEquation qe = new QuadraticEquation();
                qe.counting(a, b, c);
                qe.printSolutions();
            }
            if (choice == 3) {
                int size;
                Scanner num3 = new Scanner(System.in);
                System.out.println("Enter size of matrix: ");
                size = num3.nextInt();
                Double[][]A = new Double[size][size];
                Double[]B = new Double[size];
                System.out.println("Matrix in standard form:\na11 a12 a1n | b1\n" +
                                                             "a21 a22 a2n | b2\n" +
                                                             "am1 am2 amn | bm");
                System.out.println("Enter A: ");
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        A[i][j] = num3.nextDouble();
                    }
                }
                System.out.println("Enter B: ");
                for (int i = 0; i < size; i++) {
                        B[i] = num3.nextDouble();
                    }
                LinearSystem ls = new LinearSystem(A,B);
                Double []x = ls.solve();
                for (int i = 0; i < x.length; i++) {
                    System.out.println(x[i]);
                }
            }
        } while(choice!=4);
        input.close();
    }
}