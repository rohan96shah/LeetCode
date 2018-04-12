class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        
        for(int i=0; i<numbers.length; i++)
        {
            map.put(numbers[i], i);
        }
        
        for(int i=0; i<numbers.length; i++)
        {
            int complement = target - numbers[i];
            if(map.containsKey(complement)) {
                if(i<map.get(complement)) {
                    arr[0] = i+1;
                    arr[1] = map.get(complement)+1;
                }
                else {
                    arr[1] = i+1;
                    arr[0] = map.get(complement)+1;
                }
                break;
            }
        }
        return arr;
    }
}
