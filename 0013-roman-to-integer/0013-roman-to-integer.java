class Solution {
    public int romanToInt(String s) 
    {
        int result=0;
        for(int i=0; i<s.length(); i++)
        {   
            if((i+1) < s.length())
            {
                if(s.charAt(i)=='I' && s.charAt(i+1)=='V')
                {
                    result += 4;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='I' && s.charAt(i+1)=='X')
                {
                    result += 9;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='L')
                {
                    result += 40;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='C')
                {
                    result += 90;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='D')
                {
                    result += 400;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='M')
                {
                    result += 900;
                    i++;
                    continue;
                }  
            } 
            char a = s.charAt(i);
            switch(a)
            {
                case 'I':
                    result+=1;
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    result+=10;
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    result+=100;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
                    break;
            }
        }
        return result;
    }
}