package _011_FindDuplicatesForLessThanN;

import static com.geeksforgeeks.Test.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _011_FindDuplicatesForLessThanN.Solution } */
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
        int[] nums = { 1, 2, 3, 1, 3, 6, 6 };
        List<Integer> actual = solution.findDuplicates(nums);
        List<Integer> expected = Arrays.asList(1, 3, 6);
        assertEqualsIgnoreOrder(expected, actual);
    }
//
//    @Test
//    public void Test2() {
//        int[] nums = { 1, 2, 3, 1, 3, 4, 6 };
//        List<Integer> actual = solution.findDuplicates(nums);
//        List<Integer> expected = Arrays.asList(1, 3);
//        assertEqualsIgnoreOrder(expected, actual);
//    }

}
