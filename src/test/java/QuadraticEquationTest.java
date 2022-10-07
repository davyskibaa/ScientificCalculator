import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTests {

    @Test
    public void testOneRootQE() {
        QuadraticEquation testing = new QuadraticEquation();
        testing.counting(1,2,1);
        assertEquals(-1.0, testing.getX(), 0.0);
    }

    @Test
    public void testTwoRootsQE() {
        QuadraticEquation testing = new QuadraticEquation();
        testing.counting(4, 5, 1);
        assertEquals(-0.25, testing.getX1(), 0.0);
        assertEquals(-1.0, testing.getX2(),0.0);
    }

    @Test
    public void testNoRootsQE() {
        QuadraticEquation testing = new QuadraticEquation();
        testing.counting(2, 2, 1);
        assertEquals("No roots", testing.getOutput());
    }

    @Test
    public void testExceptionQE() {
        QuadraticEquation testing = new QuadraticEquation();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    testing.counting(0,1,0);
                });
    }
}