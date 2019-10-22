class Solution {
    public int pivotIndex(int[] nums) {
        int temp1 = 0, temp2;
        int count = 0;
        
        if(nums.length < 0 || nums.length > 10000)
            return -1;
        
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] > 1000 || nums[i] < -1000)
                return -1;
        }
        
        while(count < (nums.length))
        {
            if(count == 0)
                temp1 = 0;
            else
                temp1 = temp1 + nums[count-1];
            
            temp2 = 0;
            
            if(count < (nums.length - 1))
            {
                for(int j = count + 1; j < nums.length; j++)
                {
                temp2 = temp2 + nums[j];
                }
            }
            else
            {
                temp2 = 0;
            }
            if(temp1 == temp2)
                return count;
            
         count++;   
        }
        return -1;
    }
}
