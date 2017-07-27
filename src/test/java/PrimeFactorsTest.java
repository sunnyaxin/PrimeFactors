import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private final Number number = new Number();

    @Test
    public void test_when_input_1() throws Exception {
        assertEquals(new ArrayList(), number.primeFactors(1));
    }

    @Test
    public void test_when_input_25() throws Exception {
        assertEquals(Collections.singletonList(5), number.primeFactors(25));
    }

    @Test
    public void test_when_input_30() throws Exception {
        assertEquals(Arrays.asList(2,3,5), number.primeFactors(30));
    }

    @Test
    public void test_when_input_100() throws Exception {
        assertEquals(Arrays.asList(2,5), number.primeFactors(100));
    }
}
