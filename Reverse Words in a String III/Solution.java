class Solution 
{
    public String reverseWords(String s) 
    {
        StringBuilder sb = new StringBuilder();
            
        for(int i=s.length()-1; i>=0; i--)
        {
            sb.append(s.charAt(i));
        }
        
        String[] arr = sb.toString().split(" ");
        sb.setLength(0);
        
        for(int i=arr.length-1; i>0; i--)
        {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[0]);
        
        
        
        return sb.toString();
    }
    
}
