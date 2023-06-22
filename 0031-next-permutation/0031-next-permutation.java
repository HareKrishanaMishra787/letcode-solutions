class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;
        
        // Step 1: Find the breaking point
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }
        
        // If there is no breaking point
        if (ind1 == -1) {
            reverse(nums, 0);
        } else {
            // Step 2: Find the next greater element and swap with ind2
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[ind1]) {
                    ind2 = i;
                    break;
                }
            }
            
            swap(nums, ind1, ind2);
            
            // Step 3: Reverse the rest of the right half
            reverse(nums, ind1 + 1);
        }
    }
    
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
