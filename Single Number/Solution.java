class Solution 
{
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int ans = -1;
        
        for(int i=0; i<nums.length; i++)
        {
            if(!(map.containsKey(nums[i])))
            {
                map.put(nums[i], false);
            }
            else
            {
                map.put(nums[i], true);
            }
        }
        
        for(int i=0; i<nums.length; i++) 
        {
            if(map.get(nums[i]) == false)
            {
                ans = nums[i];
            }
        }
        return ans;
    }
}
