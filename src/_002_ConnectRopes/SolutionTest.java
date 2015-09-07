package _002_ConnectRopes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _002_ConnectRopes.Solution } */
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
        int[] nums = {4, 3, 2, 6};
        int actual = solution.minCost(nums);
        int expected = 29;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {2, 4, 3, 6};
        int actual = solution.minCost(nums);
        int expected = 29;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2};
        int actual = solution.minCost(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }
    
}
