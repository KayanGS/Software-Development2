package TaskOne;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    
    //Create a Calculator object
    Calculator calculator = new Calculator();

    @Test
    /**
     * Test if the sum of a and b is correct
     */
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(8, calculator.add(4, 4));
        assertEquals(16, calculator.add(8, 8));
    }

    @Test
    /**
     * Test if the subtraction of a and b is correct
     */
    public void testSubtract() {
        assertEquals(0, calculator.subtract(2,2));
        assertEquals(2, calculator.subtract(4,2));
        assertEquals(-2, calculator.subtract(2, 4));
    }

    @Test
    /**
     * Test if the product of a and b is correct
     */
    public void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(16, calculator.multiply(4, 4));
        assertEquals(64, calculator.multiply(8, 8));
    }

    @Test
    /**
     * Test if the division of a and b is correct
     */
    public void testDivide() {
        assertEquals(1, calculator.divide(2, 2), 0.1);
        assertEquals(0.5, calculator.divide(1, 2), 0.001);
        assertEquals(2, calculator.divide(4, 2), 0.1);
    }

}
