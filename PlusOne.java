/* Humayoon Akhtar Qaimkhani */

/* This program would take an array of positive single digit integers as one number and returns an array after adding 1 to the 
number; so if [1,2,3] is passed [1,2,4] will be returned and if [1,9,9] is passed [2,0,0] will be returned */

class Solution {
    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        int carry = 0;
        if(digits[l-1] >= 0 && digits[l-1] <= 8){
            digits[l-1] = digits[l-1] + 1;
            return digits;
        }
        
        for(int i = l-1; i >= 0 ; i--){
            if(carry == 1){
                if(digits[i] != 9){
                    digits[i] = digits[i] + carry;
                    return digits;
                }
            }
            if(digits[i] == 9){
                digits[i] = 0;
                carry = 1;
            }
        }
        int[] result = new int[l+1];
        result[0] = carry;
        return result;
        
    }
    
    public static void main(String[] args)
    {
      int[] n = {1,9,9};
      int[] x;
      x = plusOne(n);
      for(int i = 0; i < x.length; i++)
         System.out.print(" " + x[i]);
    }
    
}
