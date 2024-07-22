class Solution {
    public int removeDuplicates(int[] nums) {
    
        int result[]=new int[nums.length];
        int l=1;
        result[0]=nums[0];
        for(int i=1; i<nums.length; i++)
        {
                if(nums[i]!=nums[i-1])
                {
                    result[l++]=nums[i];
                }
        }
        
        for(int i=0; i<l;i++)
        {
            nums[i]=result[i];
        }
        return l;
    }
}