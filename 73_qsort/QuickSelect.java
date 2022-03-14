/*
Rona Recovery Squad - Brianna Tieu (with the help of DuoLingo)
APCS 06
HW 73 -- All About the About Face
2022-03-09
time spent: 1.0 hrs
*/
//--------------v  HELPER METHODS  v--------------
 //swap values at indices x, y in array o
 public static void swap( int x, int y, int[] o )
 {
   int tmp = o[x];
   o[x] = o[y];
   o[y] = tmp;
 }

 //print input array
 public static void printArr( int[] a )
 {
   for ( int o : a )
     System.out.print( o + " " );
   System.out.println();
 }

 //shuffle elements of input array
 public static void shuffle( int[] d )
 {
   int tmp;
   int swapPos;
   for( int i = 0; i < d.length; i++ ) {
     tmp = d[i];
     swapPos = i + (int)( (d.length - i) * Math.random() );
     swap( i, swapPos, d );
   }
 }

 //return int array of size s, with each element fr range [0,maxVal)
 public static int[] buildArray( int s, int maxVal )
 {
   int[] retArr = new int[s];
   for( int i = 0; i < retArr.length; i++ )
     retArr[i] = (int)( maxVal * Math.random() );
   return retArr;
 }
 //--------------^  HELPER METHODS  ^--------------


 /**
  * int mysterion(int[],int,int,int)
  * MYSTERION splits the array into two seperate arrays.
    At the chosen partition, elements are organized so that all the smaller
    elements are to the left and the greater elements are to the right.
  *
  * @param arr
  * @param a - beginning of the array that is being rearranged
  * @param b - end of the array that is being rearranged
  * @param c - the partition
  * @return int
  *
  */

// public static int findyth( int[] arr, int lo, int hi, int y ) {
//   int newIndex = partition ();
//   if (newIndex == y - 1) {
//     return arr[newIndex];
//   }
// }

 public static int partition( int arr[], int a, int b, int c)
 {
   int v = arr[c];
   swap( c, b, arr );

   int s = a;
   for ( int i = 0; i < b; i++ ) {
     if ( arr[i] < v ) {
       swap( s, i, arr);
       s++;
     }
   }
   swap( b, s, arr );
   return s;
 }//end mysterion


 //main method for testing
 public static void main( String[] args )
 {

   //init test arrays of magic numbers
   int[] arr1 = {8,21,17,69,343};
   int[] arr3 = {1,28,33,4982,37};
   int[] arr4 = {5,4,17,9000,6};
   int[] arr5 = {3,0,16,599,1024};


   // run mysterion on each array,
   // holding a & b fixed, varying c...
   for( int testC = 0; testC < 5; testC++ ) {
   System.out.println("arr1: ");
   printArr(arr1);
   mysterion(arr1,0,4,testC);
   System.out.println("after mysterion w/ a=0,b=4,c="
   + testC +"...");
   printArr(arr1);
   System.out.println("-----------------------");
 }

   System.out.println("arr3:");
   printArr(arr3);
   mysterion(arr3,0,4,testC);
   System.out.println("after mysterion w/ a=0,b=4,c="
   + testC +"...");
   printArr(arr3);
   System.out.println("-----------------------");

   System.out.println("arr4:");
   printArr(arr4);
   mysterion(arr4,0,4,testC);
   System.out.println("after mysterion w/ a=0,b=4,c="
   + testC +"...");
   printArr(arr4);
   System.out.println("-----------------------");

   System.out.println("arr5:");
   printArr(arr5);
   mysterion(arr5,0,4,testC);
   System.out.println("after mysterion w/ a=0,b=4,c="
   + testC +"...");
   printArr(arr5);
   System.out.println("-----------------------");
 }
 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
 }//end main

}//end class Mysterion
