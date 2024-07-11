class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s=="")
        {
            return true;
        }

            s=s.toLowerCase();
            StringBuilder str=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
                {
                    str.append(s.charAt(i));
                }
            }
            for(int i=0, j=str.length()-1;i<str.length();i++,j--)
            {
                if(!(str.charAt(i)==str.charAt(j)))
                {
                    return false;
                }
            }
                        return true;


    }      
}
