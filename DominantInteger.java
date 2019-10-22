/* Humayoon Akhtar Qaimkhani */

/* This program would take an array of integers and returns the index of the largest integer which is at least twice greater
than every other integer in the array */

class Solution {
    public static int dominantIndex(int[] nums) {
        int temp = 0;
        int index = 0;
        int l = nums.length;
        for(int i = 0; i < l; i++){
            if(nums[i]>temp){
                temp = nums[i];
                index = i;
            }
        }
        for(int j = 0; j < l; j++){
            if(j == index)
                continue;
            if(temp < 2*nums[j])
                return -1;
        }
        return index;
    }
    
    public static void main(String[] args)
    {
      int index;
      int[] n = {1,2,5,1,2};
      index = dominantIndex(n);
      System.out.println("The index is: " + index);
    }
    
}
