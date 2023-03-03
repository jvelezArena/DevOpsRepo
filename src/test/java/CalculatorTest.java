import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(2,3);
        assertThat(result, is(equalTo(5)));
    }

    @Test
    public void testSubstract() {
        int result = calculator.substract(3,2);
        assertThat(result, is(equalTo(1)));
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2,2);
        assertThat(result, is(equalTo(4)));
    }

    @Test
    public void testDivide() {
        int result = calculator.division(6,2);
        assertThat(result, is(equalTo(3)));
    }
}
