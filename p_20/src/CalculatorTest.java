import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testEvaluateRPN() {
        String expression = "2 3 * 4 5 * +";
        double expected = 2 * 3 + 4 * 5;
        double result = Calculation.evaluateRPN(expression);
        Assert.assertEquals(expected, result, 0.0001);
    }
}