/**
 * Time : O(NlgN) ; Space: O(N)
 * @tag : Greedy; Heap
 * @by  : Steven Cooks
 * @date: Sep 7, 2015
 ***************************************************************************
 * Description:
 * 
 * There are given n ropes of different lengths, we need to connect these 
 * ropes into one rope. The cost to connect two ropes is equal to sum of 
 * their lengths. We need to connect the ropes with minimum cost.
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/ }
 */
package _002_ConnectRopes;

import java.util.PriorityQueue;

/** see test {@link _002_ConnectRopes.SolutionTest } */
public class Solution {
    
    // each time connect the two shortest ropes
    public int minCost(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
        }
        while (queue.size() > 1) {
            int cost = queue.poll() + queue.poll();
            res += cost;
            queue.offer(cost);
        }
        return res;
    }

}
