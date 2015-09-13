/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Sep 13, 2015
 ***************************************************************************
 * Description:
 * 
 * Initially you are standing at origin (0, 0), and you are given a number k,
 * You can walk in 4 directions, up, down, left and right.
 * As long as the digits sum of one coordinates is no larger than k, then you
 * walk there, count number of points you can walk to.
 * 
 * Example: k = 3
 * 
 ***************************************************************************
 * {@link http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=117708&highlight=pocket%2Bgems }
 */
package _009_WalkingRange;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    private int count = 0;
    
    public int reachPoints(int k) {
        Set<Point> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        reach(x, y, k, visited);
        return count;
    }
    
    private void reach(int x, int y, int k, Set<Point> visited) {
        Point point = new Point(x, y);
        if (!visited.contains(point)) {
            visited.add(point);
            int sum = digitsSum(x, y);
            if (sum > k) {
                return;
            } 
//            System.out.println("here: " + point);
            count++;
            reach(x - 1, y, k, visited);
            reach(x + 1, y, k, visited);
            reach(x, y - 1, k, visited);
            reach(x, y + 1, k, visited);
        }
    }
    
    private int digitsSum(int x, int y) {
        return digits(x) + digits(y);
    }
    
    private int digits(int num) {
        if (num < 0) {
            return digits(-num);
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
