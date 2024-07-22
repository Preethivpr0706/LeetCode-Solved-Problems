class Solution {
    public int searchInsert(int[] nums, int target) {
         if(nums.length==1)
         {
             if(target==nums[0])
                return 0;
             else
             {
                 if(target>nums[0])
                 {
                     return 1;
                 }
                 else{
                     return 0;
                 }
             }
         }
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]==target)
         {
             return i;
         } 
        
     }
        int index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(target>nums[i-1] && target<nums[i])
            {
                index=i;
            }
            else if(target>nums[nums.length -1])
            {
                index= nums.length;
            }
        }
        return index;
    }
}