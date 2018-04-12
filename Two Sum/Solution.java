class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int temp = 0;
        
        for(int i=0; i<nums.length; i++) 
        {
            //start j loop from 0 to compare all values (before and after i)
            for(int j=0; j<nums.length; j++)
            {
                //we skip since we cannot add the same number twice
                if(j==i)
                {
                    continue;
                }
                else
                {
                    temp = nums[i] + nums[j];
                    if(temp == target) 
                    {
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}


/*
This soluton has O(n^2) time complexity and O(1) space complexity.

This can be changed by using a hash map instead. Although the space complexity will be compromised to O(n), the time complexity will be reduced to O(n) 
*/
