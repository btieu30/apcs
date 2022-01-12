// Brianna Tieu and Pepe
// APCS pd06
// HW54 -- One File to Bring Them All...
import java.util.ArrayList;

public class MySorts
{

/*
  BubbleSort -- Compares the elements left to right, two at a time, performing
  swaps as necessary.
  Repeat until a.length - 1 passes OR array is fully sorted (exit early)
*/
    public static void BubbleSort( ArrayList<Comparable> data )
    {
      for( int pass = 1; pass < data.size(); pass++ ) {
        //iterate thru first to next-to-last element, comparing to next
        for( int i = 0; i < data.size()-1; i++ ) {

          //if element at i > element at i+1, swap
          if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) {
            data.set( i, data.set(i+1,data.get(i)) );
          }
      }
    }
  }

/*
  InsertionSort -- Divide into sorted and unsorted regions, slowly expanding
  partition by 1 with each pass. Walk added elements into correct positions
  until partition reaches the end of array.
*/
  public static void InsertionSort( ArrayList<Comparable> data )
  {
    for( int partition = 1; partition < data.size(); partition++ ) {
      //partition marks first item in unsorted region

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
          data.set( i, data.set( i-1, data.get(i) ) );
        }
        else
          break;
    }
  }
}//end insertionSortV

/*
  SelectionSort -- Find smallest / largest element and place at smallest /
  largest index of unsorted elements until we reach a.length - 1 passes.
*/
  public static void SelectionSort( ArrayList<Comparable> data )
  {
    int maxPos;
    //note: this version places greatest value at rightmost end,

    //maxPos will point to position of SELECTION (greatest value)
    for( int pass = data.size()-1; pass > 0; pass-- ) {
      maxPos = 0;
      for( int i = 1; i <= pass; i++ ) {
        if ( data.get(i).compareTo( data.get(maxPos) ) > 0 ) {
          maxPos = i;
        }
      }
      data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
    }
  }//end selectionSort
}
