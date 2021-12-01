/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// ABA: Ariella Katz, Alif Rahman, Brianna Tieu
// APCS pd6
// HW40 -- 2D arrays
// 2021-11-30

public class TwoDimArray
{

/*
  public static String ArrayToStrings ( int [] a ) {
    String s = "";
    for (int i = 0; i < a.length; i++) {
      s += a[i] + ", ";
    }
    return s.substring (0, s.length() - 2);
  }
*/

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
  for (int i = 0; i < a.length; i++) {
    String s = "";
    for (int n = 0; n < a[i].length; n++) {
      s += (a[i])[n] + ", ";
    }
    System.out.println(s.substring(0, s.length() - 2));
  }
}

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] i : a) {
      String s = "";
      for (int n = 0; n < i.length; n++) {
        s += i[n] + ", ";
      }
      System.out.println(s.substring(0, s.length() - 2));
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int totalSum = 0;
    for (int[] i : a) {
      int sum = 0;
      for (int n = 0; n < i.length; n++) {
        sum += i[n];
      }
      totalSum += sum;
    }
    return totalSum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int rowSum = 0;
    for (int i = 0; i < a[r].length; i++) {
      rowSum += (a[r])[i];
    }
    return rowSum;
  }

  /*

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] a )
  {
    int totalSum = 0;
    for (int n = 0; n < a.length; n++) {
      for (int i = 0; i < a[n].length; i++) {
        totalSum += sumRow( i, a );
      }
    }
    return totalSum;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    return summer;
  }

*/
  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      System.out.println("testing print1...");
      print1(m1);
      print1(m2);
      print1(m3);
      System.out.println("testing print2...");
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sumRow...\n");
      System.out.println("sumRow 0 of m2 : " + sumRow(0, m2));
      System.out.println("sumRow 1 of m2 : " + sumRow(1, m2));
      System.out.println("sumRow 0 of m3 : " + sumRow(0, m3));
      System.out.println("sumRow 1 of m3 : " + sumRow(1, m3));
      System.out.println("sumRow 2 of m3 : " + sumRow(2, m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
