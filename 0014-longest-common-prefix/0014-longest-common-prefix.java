class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        try
        {
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length -1];
            for(int i=0; i<first.length();i++)
            {
                if(first.charAt(i)==last.charAt(i))
                {
                    result = result + first.charAt(i);
                }
                else
                {
                    return result;
                }
            }
            return result;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            return result;
        }
    }
}