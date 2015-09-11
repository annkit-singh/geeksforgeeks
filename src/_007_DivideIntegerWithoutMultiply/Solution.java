/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Sep 11, 2015
 ***************************************************************************
 * Description:
 *
 * Divide two integers without using / , * or %
 * 
 ***************************************************************************
 * {@link http://stackoverflow.com/questions/5386377/division-without-using }
 */
package _007_DivideIntegerWithoutMultiply;

public class Solution {

    public int divide(int divisor, int divide) {
        int denom = divide;
        int cur = 1;
        int ans = 0;
        if (divide == 0) {
            throw new IllegalArgumentException();
        } else if (divisor < divide) {
            return 0;
        } else if (divisor == divide) {
            return 1;
        }
        // left shift until denom is larger than divisor
        while (denom <= divisor) {
            denom <<= 1;
            cur <<= 1;
        }

        denom >>= 1;
        cur >>= 1;

        // decimal dividing
        while (cur != 0) {
            if (divisor >= denom) {
                divisor -= denom;
                ans |= cur;
            }
            cur >>= 1;
            denom >>= 1;
        }

        return ans;
    }

}
