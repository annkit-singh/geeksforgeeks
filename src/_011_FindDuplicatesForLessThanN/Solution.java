/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Sep 14, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a number n and an array, all numbers in array will in range [0, n - 1],
 * and each number will appear either once or twice, find all numbers that
 * appear twice.
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/ }
 */
package _011_FindDuplicatesForLessThanN;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _011_FindDuplicatesForLessThanN.SolutionTest } */
public class Solution {
    
    // label nums[number] as negative to denote we have seen number before
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // nums[index] < 0 means the (number == index) has appeared
            if (nums[Math.abs(nums[i])] >= 0) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            } else {
                res.add(Math.abs(nums[i]));
            }
        }
        return res;
    }

}
