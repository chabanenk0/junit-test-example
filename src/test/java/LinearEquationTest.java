/**
 * Created by dmitry on 23.03.16.
 */
import org.junit.Test;

import java.util.List;
import static junit.framework.Assert.*;

public class LinearEquationTest {
    @Test
    public void testSolve() {
        LinearEquation linearEquation = new LinearEquation();
        linearEquation.setA0(1);
        linearEquation.setA1(1);
        //* a0 +a1*x = 0
        List solution = null;
        try {
            solution = linearEquation.solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(solution);
        assertEquals(-1.0, solution.get(0));
    }

    @Test
    public void testAnyRealNumber() {
        LinearEquation linearEquation = new LinearEquation();
        linearEquation.setA0(0);
        linearEquation.setA1(0);
        List solution = null;
        boolean hasException = false;
        try {
            solution = linearEquation.solve();
        } catch (Exception e) {
            hasException = true;
            assertEquals("Any real number", e.getMessage());
        }
        assertTrue(hasException);
    }

    @Test
    public void testNoRealNumbers() {
        LinearEquation linearEquation = new LinearEquation();
        linearEquation.setA0(0);
        linearEquation.setA1(0);
        List solution = null;
        boolean hasException = false;
        try {
            solution = linearEquation.solve();
        } catch (Exception e) {
            assertEquals("No real numbers solution", e.getMessage());
            hasException = true;
        }
        assertTrue(hasException);
    }

}
