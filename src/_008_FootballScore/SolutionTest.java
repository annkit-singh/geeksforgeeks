package _008_FootballScore;

import static com.geeksforgeeks.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _008_FootballScore.Solution } */
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
        int m = 0;
        int n = 0;
        List<List<Integer>> actual = solution.allScores(m, n); 
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int m = 2;
        int n = 1;
        List<List<Integer>> actual = solution.allScores(m, n); 
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(2, 0));
        expected.add(Arrays.asList(2, 1));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        int m = 4;
        int n = 2;
        List<List<Integer>> actual = solution.allScores(m, n); 
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(2, 0));
        expected.add(Arrays.asList(2, 1));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(3, 0));
        expected.add(Arrays.asList(3, 1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(4, 0));
        expected.add(Arrays.asList(4, 1));
        expected.add(Arrays.asList(4, 2));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        int m = 3;
        int n = 3;
        List<List<Integer>> actual = solution.allScores(m, n); 
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0));
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(2, 0));
        expected.add(Arrays.asList(2, 1));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(3, 0));
        expected.add(Arrays.asList(3, 1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(3, 3));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
