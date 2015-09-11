package _007_DivideIntegerWithoutMultiply;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _007_DivideIntegerWithoutMultiply.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int divisor = 972;
        int divide = 5;
        int actual = solution.divide(divisor, divide);
        int expected = 194;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int divisor = 15;
        int divide = 15;
        int actual = solution.divide(divisor, divide);
        int expected = divisor / divide;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int divisor = 1;
        int divide = 5;
        int actual = solution.divide(divisor, divide);
        int expected = divisor / divide;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int divisor = 18;
        int divide = 6;
        int actual = solution.divide(divisor, divide);
        int expected = divisor / divide;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int divisor = 18;
        int divide = 7;
        int actual = solution.divide(divisor, divide);
        int expected = divisor / divide;
        assertEquals(expected, actual);
    }

}
