package _015_Intersection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _015_Intersection.Solution } */
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
        List<List<String>> strs = new ArrayList<>();
        strs.add(Arrays.asList("Boston", "London", "New York", "Beijing"));
        strs.add(Arrays.asList("London", "Boston", "Hong Kong"));
        strs.add(Arrays.asList("New York", "Boston"));
        Set<String> actual = solution.findIntersection(strs);
        Set<String> expected = new HashSet<>(Arrays.asList("Boston"));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<List<String>> strs = new ArrayList<>();
        strs.add(Arrays.asList("Boston", "London", "New York", "Beijing"));
        strs.add(Arrays.asList("Boston", "London", "New York", "Beijing"));
        strs.add(Arrays.asList("Boston", "London", "New York", "Beijing"));
        Set<String> actual = solution.findIntersection(strs);
        Set<String> expected = new HashSet<>(Arrays.asList("Boston", "Beijing", "New York", "London"));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<List<String>> strs = new ArrayList<>();
        strs.add(Arrays.asList("Boston", "London", "New York", "Beijing"));
        strs.add(Arrays.asList("Boston", "London", "Beijing"));
        strs.add(Arrays.asList("Boston", "New York", "Beijing"));
        Set<String> actual = solution.findIntersection(strs);
        Set<String> expected = new HashSet<>(Arrays.asList("Boston", "Beijing"));
        assertEquals(expected, actual);
    }

}
