class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int x = 0;
        int y = 0;
       
        for(int i=0; i<moves.length(); i++)
        {
            switch(moves.charAt(i))
            {
                case 'U':   y++;
                            break;
                case 'D':   y--;
                            break;
                case 'R':   x++;
                            break;
                case 'L':   x--;
                            break;
                default:    System.out.println("Wrong Input");
                            break;
            }
        }
        
        if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
