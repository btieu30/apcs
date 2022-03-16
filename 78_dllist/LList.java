/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW78 -- Double Up
2022-03-16
time spent: hrs
DISCO:
* To get the node after the one that is next to it we can use the method getNext() twice (tmp.getNext().getNext())
QCC:
* What is the purpose of using linked lists?
ALGO ADD:
1. Walk tmp to the node at index - 1.
2. Make a new node with a cargo of newVal and a next node of the node at index.
3. Set the next node of the node at index - 1 to be the added node.
ALGO REM:
1. Walk tmp to the node at index - 1.
2. Save the cargo in the next node (the node at index) in a String.
3. Set the next node of tmp to be node after the one next to it
   (In other words, we skipped over the node that we're trying to remove)
*/


/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private DLLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    DLLNode tmp = new DLLNode( null, newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }
// 0 1 [5] 2 3 4

  public void add( int index, String newVal ) {
    if ( index < 0 || index >= size() ) //if index invalid
      throw new IndexOutOfBoundsException();

    DLLNode tmp = _head;

    for( int i=0; i < index - 1; i++ ) { //walking to index - 1
      tmp = tmp.getNext();
    }

    DLLNode addition = new DLLNode(tmp, newVal, tmp.getNext()); //making new node and attaching it to the next node

    tmp.setNext( addition ); //attaching tmp to the new node
    tmp.getNext().setPrevious( addition );
    _size++; //incrementing size

  }

  public String remove( int index ) {
    if ( index < 0 || index >= size() ) //if index invalid
      throw new IndexOutOfBoundsException();

    DLLNode tmp = _head;
    String data;

    if (index == 0) {
      data = _head.getCargo();
      _head = _head.getNext();
      _head.setPrevious(null);
    }
    else {
      for( int i=0; i < index - 1; i++ ) //walking to index - 1
        tmp = tmp.getNext();

        data = tmp.getNext().getCargo(); //getting the cargo of the node at index

        tmp.setNext( tmp.getNext().getNext() ); //setting the next node of the node at index - 1 to be the node at index + 1
                                            //(this is so that we "skip over" the node we're trying to remove)
      }
      _size--; //decrementing size
      return data;
    }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "NULL <-> HEAD <-> ";
    DLLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + " <-> ";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    System.out.println( "removing the 2nd item... ");
    james.remove(1);
    System.out.println(james);

    System.out.println( "adding plant at index 2");
    james.add(2, "plant");
    System.out.println(james);
  }

}//end class LList
