
/**
 * <a href="https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/">1437. Check If All 1's Are at Least Length K Places Away</a>
 */

public class _1437 {
    public static class Solution {
        public boolean kLengthApart(int[] nums, int k) {
            int idx = -1;
            for (int i = 0; i< nums.length; ++i) {
                if (idx != -1) {
                    if (nums[i] == 1 && i - idx <= k) {
                        return false;
                    }
                }
                if (nums[i] == 1) {
                    idx = i;
                }
            }
            return true;
        }
    }
}
