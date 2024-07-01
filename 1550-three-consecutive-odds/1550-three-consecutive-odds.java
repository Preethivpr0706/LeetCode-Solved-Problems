class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        try{for(int i=0; i<arr.length; i++)
        {   
            if(arr[i]%2 != 0 && arr[i+1]%2 != 0 && arr[i+2]%2 != 0)
            {
                return true;
            }
            else
            {
                continue;
            }
        }
        return false;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return false;
        }
        
    }
}