import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        Assertions.assertEquals(7, calculator.add(4, 3));
    }

    @Test
    public void subtractTest() {
        Assertions.assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    public void multiplyTest() {
        Assertions.assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void divideTest() {
        Assertions.assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void shouldNotDivideWhenNumberIsZero() {
        Executable executable = () -> System.out.println(calculator.divide(10, 0));
        Assertions.assertThrows(ArithmeticException.class, executable);
    }
}
