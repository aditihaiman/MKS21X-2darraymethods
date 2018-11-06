

public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){  //returns the sum of the elements in Row x of ary.
     if (x >= ary.length) return 0;
     int sum = 0;
     for (int y = 0; y < ary[x].length; y++) {
       sum += ary[x][y];
     }
     return sum;
   }


//returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
   public static int columnSum(int[][] ary, int x){
     int sum = 0;
     for (int y = 0; y < ary.length; y++) {
       if (x < ary[y].length) {
         sum+=ary[y][x];
       }
     }
     return sum;
   }

   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary){
     int[] sum = new int[ary.length];
     for (int x = 0; x < ary.length; x++) {
       sum[x] = rowSum(ary, x);
     }

     return sum;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary){
      int len = 0;
      for (int x = 0; x < ary.length; x++){
        if (ary[x].length > len) len = ary[x].length;
      }
      int[] sum = new int[len];
      for (int x = 0; x < sum.length; x++) {
        sum[x] = columnSum(ary, x);
      }
      return sum;
    }
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   public static boolean isRowMagic(int[][] ary){
     int[] sums = allRowSums(ary);
     for (int x = 0; x < sums.length - 1; x++) {
       if (sums[x] != sums[x+1]) return false;
     }
     return true;
   }
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] ary){
     int[] sums = allColSums(ary);
     for (int x = 0; x < sums.length - 1; x++) {
       if (sums[x] != sums[x+1]) return false;
     }
     return true;
   }
    //checks if the array is column-magic (this means that every column has the same column sum).

}
