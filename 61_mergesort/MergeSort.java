import java.util.ArrayList;
/***

  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] merged = new int[a.length + b.length];
    // ArrayList<Integer> mergedAL = new ArrayList<Integer>();
    // ArrayList<Integer> a_temp = new ArrayList<Integer>();
    // ArrayList<Integer> b_temp = new ArrayList<Integer>();
    // //populate temporary arrays
    // for(int i : a){
    //   a_temp.add(i);
    // }
    // for(int i : b){
    //   b_temp.add(i);
    // }
    // //while both arrays are still populated
    // while(a_temp.size() > 0 && b_temp.size() > 0) {
    //   if(a_temp.get(0) <= b_temp.get(0)){
    //     mergedAL.add(a_temp.get(0));
    //     a_temp.remove(0);
    //   }
    //   else{
    //     mergedAL.add(b_temp.get(0));
    //     b_temp.remove(0);
    //   }
    // }
    // //move everything from b to merged if a is empty
    // if(a_temp.size() == 0){
    //   while(b_temp.size() > 0){
    //     int i = 0;
    //     mergedAL.add(b_temp.get(i));
    //     b_temp.remove(i);
    //     i++;
    //   }
    // }
    // //move everything from a to merged if b is empty
    // if(b_temp.size() == 0){
    //   while(a_temp.size() > 0){
    //     int i = 0;
    //     mergedAL.add(a_temp.get(i));
    //     a_temp.remove(i);
    //     i++;
    //   }
    // }
    // for(int i = 0; i < mergedAL.size(); i++){
    //   merged[i] = mergedAL.get(i);
    // }
    int aIndex = 0;
    int bIndex = 0;

    while (aIndex < a.length && bIndex < b.length) {
      if (a[aIndex] < b[bIndex]) {
        merged[aIndex + bIndex] = a[aIndex];
        aIndex++;
      }
      else {
        merged[aIndex + bIndex] = b[bIndex];
        bIndex++;
      }
    }
    if (aIndex == a.length) {
      while (aIndex + bIndex != merged.length) {
        merged[aIndex + bIndex] = b[bIndex];
        bIndex++;
      }
    }
    if (bIndex == b.length) {
      while (aIndex + bIndex != merged.length) {
        merged[aIndex + bIndex] = a[aIndex];
        aIndex++;
      }
  }
    return merged;
}

//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    int[] left = new int[arr.length / 2];
    int[] right = new int[arr.length - left.length];
    if (arr.length > 1) {
    for (int i = 0; i < left.length; i++) {
      left[i] = arr[i];
    }
    for (int i = 0; i < right.length; i++) {
      right[i] = arr[i + left.length];
    }
  }
  else {
    return arr;
  }
  return merge( sort(left), sort(right) );
}//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    String arr = "[";
    for( int i : a )
      arr +=  i + ", ";
    System.out.println(arr.substring(0, arr.length() - 2) + "]");

  }

  //---------------------------------------------------

  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
