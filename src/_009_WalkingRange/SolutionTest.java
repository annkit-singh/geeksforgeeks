package _009_WalkingRange;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _009_WalkingRange.Solution } */
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
        int k = 0;
        int actual = solution.reachPoints(k);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int k = 1;
        int actual = solution.reachPoints(k);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int k = 2;
        int actual = solution.reachPoints(k);
        int expected = 13;
        assertEquals(expected, actual);
    }

}
