class Solution 
{
    public boolean isPalindrome(String s) 
    {
        /*(s == null || s.equals(""))
        {
            return true;
        }
        
        s = s.replaceAll(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        
        if(s == null || s.equals(""))
        {
            return true;
        }
        
        
        s = s.toUpperCase();
        
        
        int i = s.length()-1;
        int j = 0;

        
        while(j<i)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
            }
            else
            {
                return false;
            }
        }
        
        return true;*/
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
        
    }
}
