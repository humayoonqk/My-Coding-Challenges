/* Humayoon Akhtar Qaimkhani */

/* This program would take an array of integers between -1000 to 1000 with an array size of 10000 and returns the index
whose sum of left adjacent elements will be equal to sum of right adjacent elements*/

class Solution {
    public static int pivotIndex(int[] nums) {
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
    
    public static void main(String[] args)
    {
      int index;
      int[] numb = {1,2,3,1,2}; // you can use any array of any size
      index = pivotIndex(numb);
      System.out.println("The index is: " + index);
    }
    
}
