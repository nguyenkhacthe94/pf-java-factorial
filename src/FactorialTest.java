import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Tesing factorial 0")
    void testFactorial0() {
        int n = 0;
        int expected = 1;
        long result = Factorial.factorial(n);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing factorial 1")
    void testFactorial1() {
        int n = 1;
        int expected = 1;
        long result = Factorial.factorial(n);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing factorial 10")
    void testFactorial10() {
        int n = 10;
        int expected = 3628800;
        long result = Factorial.factorial(n);
        assertEquals(expected, result);
    }
}