class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int temp=0;
          // Sort even indices in non-decreasing order
        for (int i = 0; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // Sort odd indices in non-increasing order
        for (int i = 1; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}