class Solution {
    public boolean isPalindrome(int x) {
        int y =0;
        int actual = x;
        while(x>0)
        {     
            y *= 10;
            y = y + (x%10);
            x = x / 10;
        }
        if(actual==y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}