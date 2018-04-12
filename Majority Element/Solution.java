class Solution 
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }    
        }
        
        /*
        Iterating through a HashMap:
        
        public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
            }
        }
        */
        int index = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(map.get(nums[i]) >= ((float)nums.length/2.0000))
            {
                index = i;
                break;
            }
        }
        
        return nums[index];
        
    }
}
