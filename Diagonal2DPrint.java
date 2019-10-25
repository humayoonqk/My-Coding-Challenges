// This code prints 2-D array in diagonal form
public class Solution{
   public static int[] findDiagonalOrder(int[][] matrix){
      int sum = 0;
      int l = 0;
      int rows = matrix.length;
      int columns;
      for(int i = 0; i < matrix.length; i++){
         for(int j = 0; j < matrix[i].length && matrix[i] != null; j++){
         l++;
         }
         columns = matrix[i]. length;
      }

      int res[] = new int[l];
      int idx = 0;

      while(sum <= l){
      if(sum % 2 != 0 || sum == 0){
         for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length && matrix[i] != null; j++){
               if(sum == (i + j)){
                  res[idx] = matrix[i][j];
                  idx++;
                  }
            }
         }
       }

       else{
         for(int i = (matrix.length - 1); i >= 0; i--){
            for(int j = 0; j < matrix[i].length && matrix[i] != null; j++){
               if(sum == (i + j)){
                  res[idx] = matrix[i][j];
                  idx++;
                  }
            }
         }


       }

         sum++;
      }

      return res;
   }


   public static void main(String[] args){
   int[][] a = new int[3][3];
   int e = 1;
   int size = 0;

   for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length && a[i] != null; j++){
         a[i][j] = e;
         e++;
         size++;
      }
   }

   int[] result = new int[size];

   System.out.println("Printing 2-D Array: ");

   for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length && a[i] != null; j++){
         System.out.print(" " + a[i][j]);
      }
      System.out.println();
   }

   result = findDiagonalOrder(a);

   for(int k = 0; k < result.length; k++)
      System.out.print(" " + result[k]);


  }

}
