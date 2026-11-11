class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longest = 0;
        int current = 0;
        for (int value : nums) {
            if (value == 1) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }
        return longest;
    }
}
