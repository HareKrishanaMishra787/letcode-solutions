class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        
        if (n == 1 || nums[0] > nums[1])
            return 0;

        if (nums[n - 1] > nums[n - 2])
            return n - 1;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] < nums[m + 1])
                l = m + 1;
            else
                r = m;
        }

        return l;
    }
}
