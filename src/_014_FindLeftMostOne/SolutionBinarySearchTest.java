package _014_FindLeftMostOne;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionBinarySearchTest {
    
    /** Test method for {@link _014_FindLeftMostOne.SolutionBinarySearch } */
    SolutionBinarySearch solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBinarySearch();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1 () {
        int[][] matrix = {
                { 0, 0, 0, 0 },
                { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 0, 0, 0, 1 },
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2 () {
        int[][] matrix = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3 () {
        int[][] matrix = {
                { 0, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4 () {
        int[][] matrix = {
                { 0, 0, 0},
                { 0, 1, 1},
                { 0, 0, 1},
                { 0, 0, 1},
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5 () {
        int[][] matrix = {
                { 0, 0, 0, 0 },
                { 0, 0, 1, 1 },
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6 () {
        int[][] matrix = {
                { 1 }
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7 () {
        int[][] matrix = {
                { 0 },
                { 1 },
                { 0 },
                { 1 },
                { 1 }
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8 () {
        int[][] matrix = {
                { 0, 0, 0, 0, 0, 0, 1}
        };
        int actual = solution.findLeftmostOne(matrix);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
