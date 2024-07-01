class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int element : nums)
        {
            if(element!=val)
            {
                nums[k]=element;
                k++;
            }
        }
        return k;
    }
}