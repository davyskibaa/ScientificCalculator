import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSystemTest {

    private LinearSystem linearSystem;
    private Double [][]workingMatrix;

    @Test
    public void test2x2LS() {
        Double [][]A = new Double[2][2];
        Double []B = new Double [2];
        A[0][0] = 5.0;
        A[0][1] = 4.0;
        A[1][0] = 1.0;
        A[1][1] = -3.0;
        B[0] = 0.0;
        B[1] = 2.0;
        linearSystem = new LinearSystem(A,B);
        Double x = linearSystem.calculateCoeficientsMatrixDeterminant();
        assertEquals(x, -19.0);
    }

    @Test
    public void testDeterminant3x3LS() {
        Double [][]A = new Double[3][3];
        A[0][0] = 5.0;
        A[0][1] = 4.0;
        A[0][2] = 1.0;
        A[1][0] = 1.0;
        A[1][1] = -3.0;
        A[1][2] = -5.0;
        A[2][0] = 8.0;
        A[2][1] = 0.0;
        A[2][2] = -1.0;
        Double []B = new Double [3];
        B[0] = 0.0;
        B[1] = 2.0;
        B[2] = -5.0;
        linearSystem = new LinearSystem(A,B);
        Double det = linearSystem.calculateCoeficientsMatrixDeterminant();
        assertEquals(-117.0, det);
    }

    @Test
    public void testSolve3x3LS() {
        Double [][]A = new Double[3][3];
        A[0][0] = 5.0;
        A[0][1] = 4.0;
        A[0][2] = 1.0;
        A[1][0] = 1.0;
        A[1][1] = -3.0;
        A[1][2] = -5.0;
        A[2][0] = 8.0;
        A[2][1] = 0.0;
        A[2][2] = -1.0;
        Double []B = new Double [3];
        B[0] = 0.0;
        B[1] = 2.0;
        B[2] = -5.0;
        linearSystem = new LinearSystem(A,B);
        Double []x = linearSystem.solve();
        assertTrue(-0.795 < x[0] && x[0] < -0.794);
        assertTrue(1.3332 <= x[1] && x[1] <= 1.3334 );
        assertTrue(-1.359 < x[2] && x[2] < -1.358);
    }

    @Test
    public void testCopyMatrixLS() {
        workingMatrix = new Double[3][3];
        Double c = 1.0;
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++) {
                workingMatrix[i][j] = c;
                c++;
            }
        }
        linearSystem = new LinearSystem();
        Double [][]x = linearSystem.copyMatrix(workingMatrix, 3, 0);
        assertEquals(5.0, x[0][0]);
        assertEquals(x[0][1], 6.0);
        assertEquals(x[1][0], 8.0);
        assertEquals(x[1][1], 9.0);

    }
}

