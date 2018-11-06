/* public class Driver2 { //from Ethan Morgan
	private static String s(int[] array) {
		String out = "[";
		for (int i = 0; i < array.length; i++) {
			out += ""+array[i];
			if (i+1 != array.length) out += ", ";
		}
		return out+"]";
	}

	private static String s(int[][] array) {
		String out = "[";
		for (int i = 0; i < array.length; i++) {
			out += ""+s(array[i]);
			if (i+1 != array.length) out += ", ";
		}
		return out+"]";
	}

	public static void main(String[] args) {

		int[][] array0 = {{},{0,1,2,3,4},{4,3,2,1,0,4,4,4}};
		int[][] array1 = {{0,1,2,0},{3},{1,1,1}};

		int c = 0;

		try {
			try {
				if (ArrayMethods.rowSum(array0, 0) != 0) System.out.println(++c+". You are returning a non-0 number when rowSum is called on an empty array.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(++c+". You are producing an ArrayIndexOutOfBoundsException when calling rowSum on an empty array. Count the missing values as 0 instead.");
			}
			try {
				if (ArrayMethods.rowSum(array0, 2) != 22) System.out.println(++c+". You are returning the wrong number when rowSum is called on a populated array.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(++c+". You are producing an ArrayIndexOutOfBoundsException when calling rowSum on a populated array.");
			}
			// Commented, as Mr K will not be testing negative indices.
			//if (ArrayMethods.rowSum(array0, -1) != 0) System.out.println(++c+". You are returning a non-0 number when rowSum is called with a negative index.");

			try {
				if (ArrayMethods.rowSum(array0, 999) != 0) System.out.println(++c+". You are returning a non-0 number when rowSum is called with an out of range index.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(++c+". You are producing an ArrayIndexOutOfBoundsException when rowSum is called with an out of range index. Count the missing values as 0 instead.\n\t-note: K may not be testing this.");
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when calling rowSum.");
		}

		try {
			try {
				if (ArrayMethods.columnSum(array0, 3) != 4) System.out.println(++c+". You are returning the wrong number when columnSum is called on a populated array.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(++c+". You are producing an ArrayIndexOutOfBoundsException when calling columnSum on a jagged array. Count the missing values as 0 instead.");
			}
			 //Commented, as Mr K will not be testing negative indices.
			//try {
				//if (ArrayMethods.columnSum(array0, -1) != 0) System.out.println(++c+". You are returning a non-0 number when columnSum is called with a negative index.");
			//} catch (ArrayIndexOutOfBoundsException e) {
			//	System.out.println(++c+". You are producing an ArrayIndexOutOfBoundsException when calling columnSum on with a negative index. Count missing values as 0 instead.");
		//	}
			try {
				if (ArrayMethods.columnSum(array0, 999) != 0) System.out.println(++c+". You are returning a non-0 number when columnSum is called with an out of range index.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(++c+". You are producing an ArrayIndexOutOfBoundsException when calling columnSum on with a negative index. Count missing values as 0 instead.");
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when calling columnSum.");
		}

		try {
			if (!s(ArrayMethods.allRowSums(array0)).equals("[0, 10, 22]")) {
				System.out.println(++c+". You are returning the wrong array when allRowSums is called.");
				System.out.println("\tinput:          "+s(array0));
				System.out.println("\tdesired result: [0, 10, 22]");
				System.out.println("\tyour result:    "+s(ArrayMethods.allRowSums(array0)));
			}
			if (!s(ArrayMethods.allRowSums(array1)).equals("[3, 3, 3]")) {
				System.out.println(++c+". You are returning the wrong array when allRowSums is called.");
				System.out.println("\tinput:          "+s(array1));
				System.out.println("\tdesired result: [3, 3, 3]");
				System.out.println("\tyour result:    "+s(ArrayMethods.allRowSums(array1)));
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when calling allRowSums.");
		}

		try {
			if (!s(ArrayMethods.allColSums(array0)).equals("[4, 4, 4, 4, 4, 4, 4, 4]")) {
				System.out.println(++c+". You are returning the wrong array when allColSums is called.");
				System.out.println("\tinput:          "+s(array0));
				System.out.println("\tdesired result: [4, 4, 4, 4, 4, 4, 4, 4]");
				System.out.println("\tyour result:    "+s(ArrayMethods.allColSums(array0)));
			}
			if (!s(ArrayMethods.allColSums(array1)).equals("[4, 2, 3, 0]")) {
				System.out.println(++c+". You are returning the wrong array when allColSums is called.");
				System.out.println("\tinput:          "+s(array1));
				System.out.println("\tdesired result: [4, 2, 3, 0]");
				System.out.println("\tyour result:    "+s(ArrayMethods.allColSums(array1)));
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when calling allColSums.");
		}

		try {
			if (ArrayMethods.isRowMagic(array0)) {
				System.out.println(++c+". You are saying that an array is RowMagic when it isn't.");
				System.out.println("\tinput:          "+s(array0));
				System.out.println("\tdesired result: false");
				System.out.println("\tyour result:    true");
			}
			if (!ArrayMethods.isRowMagic(array1)) {
				System.out.println(++c+". You are saying that an array isn't RowMagic when it is.");
				System.out.println("\tinput:          "+s(array1));
				System.out.println("\tdesired result: true");
				System.out.println("\tyour result:    false");
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when calling isRowMagic.");
		}

		try {
			if (ArrayMethods.isColumnMagic(array1)) {
				System.out.println(++c+". You are saying that an array is ColumnMagic when it isn't.");
				System.out.println("\tinput:          "+s(array1));
				System.out.println("\tdesired result: false");
				System.out.println("\tyour result:    true");
			}
			if (!ArrayMethods.isColumnMagic(array0)) {
				System.out.println(++c+". You are saying that an array isn't ColumnMagic when it is.");
				System.out.println("\tinput:          "+s(array0));
				System.out.println("\tdesired result: true");
				System.out.println("\tyour result:    false");
			}
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when calling isColumnMagic.");
		}

		if (c == 0) System.out.println("Your code passed every test. Nice work.");
		else System.out.println("\nYou produced "+c+" unexpected result(s). Keep debugging!");
	}
} */

public class Driver2{
  //Printing Methods
  public static String printArray(int[] ary){
    if (ary.length == 0){
      return "[]";
    }
    String output = "[";
    for (int i = 0; i < ary.length - 1; i++){
      output += ary[i] + ", ";
    }
    return output + ary[ary.length - 1] + "]";
  }
  public static String printArray(int[][] ary){
    String output = "[\n";
    for (int x = 0; x < ary.length; x++){
      output += "  " + printArray(ary[x]);
      if (x != ary.length - 1){
       output += ",\n";
      }
      else output += "\n";
    }
    return output + "]";
  }
  public static void main(String[]args){
    int[][] a = new int[][]{
      {},
      {1, 2, 3},
      {-2, 4, 0},
      {9, -2, 5},
      {-3, 7}
    };
    int[][] b = new int[][]{
      {9, 2, -7},
      {2, 2},
      {4, 5, 8}
    };
    int[][] c = new int[][]{
      {9, 8, 7, 10},
      {6, 5, 4, 11},
      {3, 2, 1, 12}
    };
    int[][] empty = new int[][]{
      {},
      {},
      {},
      {},
      {},
    };
    int[][] magicRow = new int[][]{
      {1, 1, 1, 1, 1, 1},
      {2, -2, 2, 2, -2, -2, 6},
      {3, 3, 6, -4, -2},
      {0, 10, -5, 1}
    };
    int[][] magicRow2 = new int[][]{
      {12},
      {9, 0, 2, 1},
      {-24, 36},
      {4, 4, 2, 2, 0},
      {7, 5}
    };
    int[][] magicColumn = new int[][]{
      {8},
      {-9, 0, 3, -1, 8},
      {2, 1, 2},
      {7, 7, 3, 9}
    };
    int[][] magicColumn2 = new int[][]{
      {17, 2, 7},
      {5, -6, 12, -16},
      {-14, 10, -11, 0, 8},
      {0, 2, 0, 24}
    };
    System.out.println("\n\n--------Testing printArray(int[] ary)--------");
    System.out.println("a[1]--> Should print [1, 2, 3]: " + printArray(a[1]));
    System.out.println("b[1]--> Should print [2, 2]: " + printArray(b[1]));
    System.out.println("c[2]--> Should print [3, 2, 1, 12]: " + printArray(c[2]));
    System.out.println("empty[0]--> Should print []: " + printArray(empty[0]));
    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Testing printArray(int[][] ary)--------");
    System.out.println("magicRow--> Should print [[1, 1, 1, 1, 1, 1], [2, -2, 2, 2, -2, -2, 6], [3, 3, 6, -4, -2], [0, 10, -5, 1]]: \n" + printArray(magicRow));
    System.out.println("magicColumn--> Should print [[8], [9, 0, 3, -1, 8], [2, 1, 2], [7, 7, 3, 9]]: \n" + printArray(magicColumn));
    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Phase 1 Testing--------");
    try{
      System.out.println("\n--------Testing int rowSum(int[][] ary, int x)--------");
      System.out.println("Should print 34: " + ArrayMethods.rowSum(c, 0));
      System.out.println("Should print 6: " + ArrayMethods.rowSum(a, 1));
      System.out.println("Should print 4: " + ArrayMethods.rowSum(b, 0));
      /*Commented out: Instead of an error, this should be 0
      System.out.println("\nIndex too big --> Should print printStackTrace: ");
      */
      System.out.println("Index too large--> Should print 0: " + ArrayMethods.rowSum(b,3)); //Error Testing
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when the index is too large in rowSum. Return 0 instead!");
      e.printStackTrace();
    }
    //Error Testing
    /*Commented out: Mr. K will not be testing negative indices
    try{
      System.out.println("\nNegative Index --> Should print printStackTrace: ");
      System.out.println(ArrayMethods.rowSum(b, -1)); //Error Testing
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    */
    try{
      System.out.println("Empty Array: should print 0: "+ ArrayMethods.columnSum(empty,0));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    try{
      System.out.println("\n\n--------Testing int columnSum(int[][] ary, int x)--------");
      System.out.println("Should print 18: " + ArrayMethods.columnSum(c,0));
      System.out.println("Should print 9: " + ArrayMethods.columnSum(b,1));
      System.out.println("Should print 1: " + ArrayMethods.columnSum(b,2));
      //^^^Here one of the rows is shorter than others
      System.out.println("Should print 5: " + ArrayMethods.columnSum(a,0));
      /*Commented out: Instead of an error, this should be 0
      System.out.println("\nIndex too big --> Should print printStackTrace: ");
      */
      System.out.println("Index too large--> Should print 0: " + ArrayMethods.columnSum(a, 3)); //Error Testing
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when the index is too large in columnSum. Return 0 instead!");
      e.printStackTrace();
    }
    //Error Testing
    /*Commented out: Mr. K will not be testing negative indices
    try{
      System.out.println("\nNegative Index --> Should print printStackTrace: ");
      System.out.println(ArrayMethods.columnSum(a, -1)); //Error Testing
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    */
    try{
      System.out.println("Empty Array: should print 0: "+ ArrayMethods.columnSum(empty,0));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutofBoundsException when finding the columnSum of an empty array. Return 0 instead!");
      e.printStackTrace();
    }

    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Phase 2 Testing--------");
    try{
      System.out.println("\n--------Testing allRowSums(int[][] ary)--------");
      System.out.println("Should print [4, 4, 17]: " + printArray(ArrayMethods.allRowSums(b)));
      System.out.println("Should print [34, 26, 18]: " + printArray(ArrayMethods.allRowSums(c)));
      System.out.println("Empty Array: should print [0, 0, 0, 0, 0]: " + printArray(ArrayMethods.allRowSums(empty)));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running ArrayMethods.allRowSums on an empty array!");
      e.printStackTrace();
    }
    //Error Testing
    try{
      System.out.println("Should print [0, 6, 2, 12, 4]: " + printArray(ArrayMethods.allRowSums(a)));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running ArrayMethods.allRowSums on an array containing an empty array!");
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    try{
      System.out.println("\n--------Testing allColSums(int[][] ary)--------");
      System.out.println("Should print [18, 15, 12, 33]: " + printArray(ArrayMethods.allColSums(c)));
      System.out.println("Should print [15, 9, 1]: " + printArray(ArrayMethods.allColSums(b)));
      System.out.println("Should print [5, 11, 8]: " + printArray(ArrayMethods.allColSums(a)));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running ArrayMethods.allColSums on an uneven array!");
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Phase 3 Testing--------");
    try{
      System.out.println("\n--------Testing isRowMagic(int[][] ary)--------");
      System.out.println("Should print true: " + ArrayMethods.isRowMagic(magicRow));
      System.out.println("Should print true: " + ArrayMethods.isRowMagic(magicRow2));
      System.out.println("Should print true: " + ArrayMethods.isRowMagic(empty));
      System.out.println("Should print false: " + ArrayMethods.isRowMagic(a));
      System.out.println("Should print false: " + ArrayMethods.isRowMagic(b));
      System.out.println("Should print false: " + ArrayMethods.isRowMagic(c));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running isRowMagic");
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    try{
      System.out.println("\n--------Testing isColumnMagic(int[][] ary)--------");
      System.out.println("Should print true: " + ArrayMethods.isColumnMagic(magicColumn));
      System.out.println("Should print true: " + ArrayMethods.isColumnMagic(magicColumn2));
      System.out.println("Should print true: " + ArrayMethods.isColumnMagic(empty));
      System.out.println("Should print false: " + ArrayMethods.isColumnMagic(a));
      System.out.println("Should print false: " + ArrayMethods.isColumnMagic(b));
      System.out.println("Should print false: " + ArrayMethods.isColumnMagic(c));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running isColumnMagic");
      e.printStackTrace();
    }
  }
}
