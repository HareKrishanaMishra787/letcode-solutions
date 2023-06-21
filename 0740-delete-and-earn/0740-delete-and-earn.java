class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        
        // Count the frequency of each number and accumulate the values
        for (int num : nums) {
            values[num] += num;
        }

        int take = 0;
        int skip = 0;
        
        // Calculate the maximum points
        for (int i = 0; i < n; i++) {
            int takei = skip + values[i];  // Take the current number and add it to the previous skip value
            int skipi = Math.max(skip, take);  // Skip the current number, choose the maximum value between the previous take and skip
            take = takei;  // Update the take value
            skip = skipi;  // Update the skip value
        }
        
        return Math.max(take, skip);  // Return the maximum points
    }
}
