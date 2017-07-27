import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private final Number number = new Number();

    @Test
    public void test_when_input_1() throws Exception {
        assertEquals(new ArrayList(), number.primeFactors(1));
    }
}
