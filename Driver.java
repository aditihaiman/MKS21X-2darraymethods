/*public class Driver {
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
}*/
import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    int[][] ary = new int[5][5];
    System.out.println("Empty array should be initialized to 0: " + Arrays.deepToString(ary));
    System.out.println("Row sum of a new array's row should be 0: " + ArrayMethods.rowSum(ary, 2));
    for (int i = 0; i < ary[0].length; ++i)
      ary[0][i] = 5;
    System.out.println();
    System.out.println("Row sum of row with five 5s should 25: " + ArrayMethods.rowSum(ary, 0));
    System.out.println();

    //Testing columnSum()
    ary[0][2] = 4;
    ary[1][2] = 10;
    ary[2][2] = -5;
    ary[3][2] = -15;
    ary[4][2] = 20;
    System.out.println("Just to see what's changed: " + Arrays.deepToString(ary));
    System.out.println("Column sum of column 2 is 4 + 10 - 5 - 15 + 20 is 14: " + ArrayMethods.columnSum(ary, 2));
    System.out.println();

    //Testing allRowSums()
    System.out.println("As of now, the rowSums should be [24, 10, -5, -15, and 20]: " + Arrays.toString(ArrayMethods.allRowSums(ary)));
    //Testing allColSums()
    System.out.println("As of now, the columnSums should be [5, 5, 14, 5, and 5]: " + Arrays.toString(ArrayMethods.allColSums(ary)));
    System.out.println();

    //Testing isRowMagic()
    System.out.println("Shouldn't be magic yet: " + ArrayMethods.isRowMagic(ary));
    int[][] ary2 = new int[5][];
    ary2[0] = new int[]{1, 14};
    ary2[1] = new int[]{1, 2, 12};
    ary2[2] = new int[]{1, 2, 3, 4, 5};
    ary2[3] = new int[]{1, 2, 3, 9};
    ary2[4] = new int[]{15};

    System.out.println("Let's make a magic-row arr: " + Arrays.deepToString(ary2));
    System.out.println("Is it magic now? " + ArrayMethods.isRowMagic(ary2));
    System.out.println();

    System.out.println("Just to verify rowSum works with non-rectangular arrays: " + ArrayMethods.rowSum(ary2, 1));
    System.out.println("Same with columnSum: " + ArrayMethods.columnSum(ary2, 2));
    System.out.println("Again, just for fun: " + ArrayMethods.columnSum(ary2, 3));
    System.out.println();

    //Testing isColumnMagic()
    System.out.println("Columns shouldn't be magic yet: " + ArrayMethods.isColumnMagic(ary));
    int[][] ary3 = new int[4][];
    ary3[0] = new int[]{1, 2};
    ary3[1] = new int[]{1, 1, 0};
    ary3[2] = new int[]{1, 1, 3, 4, 4};
    ary3[3] = new int[]{1, 0, 1, 0};

    System.out.println("But now it should be, with this array: " + Arrays.deepToString(ary3));
    System.out.println("Is it magic-column now? " + ArrayMethods.isColumnMagic(ary3));
  }
}
