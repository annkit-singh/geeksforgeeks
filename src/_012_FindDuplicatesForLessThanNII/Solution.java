/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Sep 14, 2015
 ***************************************************************************
 * Description:
 * 
 * Follow-up for FindDuplicatesForLessThanN.
 * 
 * Now find out all numbers that are only appear once.
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/ }
 */
package _012_FindDuplicatesForLessThanNII;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _012_FindDuplicatesForLessThanNII.SolutionTest } */
public class Solution {
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // nums[index] < 0 means the (number == index) has appeared
            if (nums[Math.abs(nums[i])] >= 0) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            } else {
                // if this number we have seen, set it as positive again
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }
        }
        // now all duplicates and never-shown number are labelled as positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])] < 0) {
                res.add(Math.abs(nums[i]));
            }
        }
        return res;
    }

}
