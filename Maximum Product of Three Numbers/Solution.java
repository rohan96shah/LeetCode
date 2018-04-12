class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        //We will find the 3 highest elements in the array and multiply them
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max_index = 0;
        int max2_index = 0;
        int min_index = 0;
        
        
        //Finding max number in the array
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
                max_index = i;
            }
            else
            {
                continue;
            }
        }
        
        //Finding 2nd highest number in the array
        for(int i=0; i<nums.length; i++)
        {
            if((nums[i]>max2) && (i!=max_index))
            {
                max2 = nums[i];
                max2_index = i;
            }
        }
        
        //Finding 3rd highest number in the array
        for(int i=0; i<nums.length; i++)
        {
            if((nums[i]>max3) && (i!=max_index) && (i!=max2_index))
            {
                max3 = nums[i];
            }
        }
        
        //Finding the minimum number in the array
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<min)
            {
                min = nums[i];
                min_index = i;
            }
        }
              
        //Finding the second minimum number in the array
        for(int i=0; i<nums.length; i++)
        {
            if((nums[i]<min2) && (i!=min_index))
            {
                min2 = nums[i];
            }
        }
        
        max = Math.max(max * max2 * max3, max * min * min2);
        
        return max;
        
    }
}
