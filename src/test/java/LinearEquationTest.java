import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearEquationTest {

    @Test
    public void testRootLE() {
        LinearEquation testing = new LinearEquation();
        testing.count(2, -10);
        assertEquals(5, testing.getX());
    }

    @Test
    public void testExceptionLE() {
        LinearEquation testing = new LinearEquation();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    testing.count(0,0);
                });
    }
}
