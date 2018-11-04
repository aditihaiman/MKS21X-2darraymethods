public class Driver {
  public static String printArray(int[] arr) {
    String output = "[";
    for (int idx = 0; idx < arr.length; idx ++) {
      output += arr[idx];
      if (idx < arr.length - 1) {
        output += ", ";
      }
    }
    output += "]";
    return output;
  }
  public static String printArray(int[][] arr) {
    String output ="[[";
    for (int x = 0; x < arr.length; x ++) {
      for (int y = 0; y < arr[x].length; y ++) {
        output += arr[x][y];
        if (y < arr[x].length - 1) {
          output += ", ";
        }
      }
      if (x < arr.length - 1) {
        output += "], [";
      }
    }
    output += "]]";
    return output;
  }
  public static void main(String[] args) {
    int[][] a = {
      {1,2,3,4},
      {3,5,7,2,4},
      {6,17,3}
    };
    int[][] b = {
      {1,2,3,4},
      {3,4,3}
    };
    int[][] c = {
      {1,5,8,19},
      {16,12,9,-2}
    };
    System.out.println("Array a: " + printArray(a));
    System.out.println("Array b: " + printArray(b));
    System.out.println("Array c: " + printArray(c) + "\n");
    System.out.println("Testing Part 1\n");
    System.out.println("Finding the sum of each row");
    System.out.println("First Row: should return 10");
    System.out.println(ArrayMethods.rowSum(a,0));
    System.out.println("Second Row: should return 21");
    System.out.println(ArrayMethods.rowSum(a,1));
    System.out.println("Third Row: should return 26");
    System.out.println(ArrayMethods.rowSum(a,2) + "\n");
    System.out.println("Finding the sum of each column");
    System.out.println("First Column: should return 10");
    System.out.println(ArrayMethods.columnSum(a,0));
    System.out.println("Second Column: should return 24");
    System.out.println(ArrayMethods.columnSum(a,1));
    System.out.println("Third Column: should return 13");
    System.out.println(ArrayMethods.columnSum(a,2));
    System.out.println("Fourth Column: should return 6");
    System.out.println(ArrayMethods.columnSum(a,3));
    System.out.println("Fifth Column: should return 4");
    System.out.println(ArrayMethods.columnSum(a,4) + "\n\n");
    System.out.println("Testing Part 2\n");
    System.out.println("Putting all the row and column sums into arrays");
    System.out.println("Array of row sums: Should return [10, 21, 26]");
    System.out.println(printArray(ArrayMethods.allRowSums(a)));
    System.out.println("Array of column sums: Should return [10, 24, 13, 6, 4]");
    System.out.println(printArray(ArrayMethods.allColSums(a)) + "\n\n");
    System.out.println("Testing Part 3\n");
    System.out.println("Testing whether each array has \"row magic\"");
    System.out.println("Array a: should return false");
    System.out.println(ArrayMethods.isRowMagic(a));
    System.out.println("Array b: should return true");
    System.out.println(ArrayMethods.isRowMagic(b) + "\n");
    System.out.println("Testing whether each array has \"column magic\"");
    System.out.println("Array a: should return false");
    System.out.println(ArrayMethods.isColumnMagic(a));
    System.out.println("Array c: should return true");
    System.out.println(ArrayMethods.isColumnMagic(c) + "\n");
    System.out.println("Woohoo good job!");
  }
}
