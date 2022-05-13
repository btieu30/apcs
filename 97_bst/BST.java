// FIRE: Fang Chen, Courtney Huang, Brianna Tieu
// APCS pd06
// HW 97 -- Prune Your Tree
// 2022-05-09
// time spent: 1.5 hr

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  private TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    insert(_root, newNode);

  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if (stRoot == null) {
      _root = newNode;
      return;
    }
    if (newNode.getValue() < stRoot.getValue()) {
      if (stRoot.getLeft() != null) {
        insert(stRoot.getLeft(), newNode);
      } else {
        stRoot.setLeft(newNode);
      }
    } else {
      if (stRoot.getRight() != null) {
        insert(stRoot.getRight(), newNode);
      } else {
        stRoot.setRight(newNode);
      }
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    System.out.print(currNode.getValue());
    if (currNode.getLeft() != null) {
      preOrderTrav(currNode.getLeft());
    }
    if (currNode.getRight() != null) {
      preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null) {
      inOrderTrav(currNode.getLeft());
    }
    System.out.print(currNode.getValue());
    if (currNode.getRight() != null) {
      inOrderTrav(currNode.getRight());
    }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null) {
      postOrderTrav(currNode.getLeft());
    }
    if (currNode.getRight() != null) {
      postOrderTrav(currNode.getRight());
    }
    System.out.print(currNode.getValue());
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   *****************************************************/
  TreeNode search( int target )
  {
    TreeNode _target = new TreeNode(target);
    TreeNode copy = _root;
    while (copy != null) {
     if (copy.getValue() == _target.getValue()) {
      _target = copy;
      return _target;
    } else if (copy.getValue() < _target.getValue())  {
      copy = copy.getRight();
    } else {
      copy = copy.getLeft();
    }
  }
  return null;
}


  /*****************************************************
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 0
   *****************************************************/
  public int height()
  {
    int left = 0;
    int right = 0;
    if (_root.getLeft() == null && _root.getLeft() == null) {
      return 0;
    }
    TreeNode tempLeft = _root.getLeft();
    TreeNode tempRight = _root.getRight();
    while (tempLeft != null) { //while there are left children
      left++;
      tempLeft = tempLeft.getLeft();
    }
    while (tempRight != null) { //while there are right children
      right++;
      tempRight = tempRight.getRight();
    }
    if (left > right) { return left; }
    else { return right; }
  }


  /*****************************************************
   * int numLeaves()
   * returns number of leaves in tree
   *****************************************************/
  public int numLeaves()
  {
    TreeNode left = _root.getLeft();
    TreeNode right = _root.getRight();
    int counter = 1;
    while (left != null){
      if (right != null){
        counter ++;
      }
      left = left.getLeft();
    }
    while (right != null){
      if (left != null){
        counter ++;
      }
      right = right.getRight();
    }
    return counter;
  }

public int remove(int target) {
  TreeNode leader = _root;
  TreeNode follower = _null;
  //finding and setting the target node and its follower
  while (leader.getValue() != target) {
    follower = leader;
    if (leader.getValue() < target) {
      leader = leader.getRight();
    } else {
      leader = leader.getLeft();
    }
  }
  //left subtree
  if (leader.getRight() == null) {
    if (follower.getLeft() == leader) { //target to the left of follower
      follower.setLeft(leader.getLeft());
    } else if (follower.getRight() == leader) { //target right of follower
      follower.setRight(leader.getLeft());
    } else { //target is the root
      _root = _root.getLeft();
    }
  }
  //right subtree
  else if (leader.getLeft() == null) {
    if (follower.getLeft() == leader) { //target to the left of follower
      follower.setLeft(leader.getRight());
    } else if (follower.getRight() == leader) { //target right of follower
      follower.setRight(leader.getRight());
    } else { //if target is the root
      _root = _root.getRight();
    }
  }
  //target has no children :(
  else if (isLeaf(leader)) { //using isLeaf helper from library
    if (leader == root) {
      _root = null; // remove from one node tree
    } else if (follower.getLeft() == leader) {
      follower.setLeft(null); //left to null if target to left of follower
    } else {
      follower.setRight(null); //right to null if target to right of follower
    }
  }
  //target has two subtrees
  else {return true;}
}

//~~~~~~~~~~~~~v~~MISC.HELPERS~~v~~~~~~~~~~~~~~~~~~~
public boolean isLeaf( TreeNode node )
{
  return ( node.getLeft() == null
           &&
           node.getRight() == null );
}
//~~~~~~~~~~~~~^~~MISC.HELPERS~~^~~~~~~~~~~~~~~~~~~~

  //main method for testing
  public static void main( String[] args )
  {
      // BST arbol = new BST();
      //
      // //PROTIP: sketch state of tree after each insertion
      // //        ...BEFORE executing these.
      // arbol.insert( 4 );
      // arbol.insert( 2 );
      // arbol.insert( 5 );
      // arbol.insert( 6 );
      // arbol.insert( 1 );
      // arbol.insert( 3 );
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "pre-order traversal:" );
      // arbol.preOrderTrav();
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "in-order traversal:" );
      // arbol.inOrderTrav();
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "post-order traversal:" );
      // arbol.postOrderTrav();
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "finding the leaves" );
      // System.out.println(arbol.numLeaves());
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "search() testing ...");
      // System.out.println( arbol.search(5).getValue() );
      // System.out.println( arbol.search(0) );
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "height() testing ...");
      // System.out.println( arbol.height());
      // arbol.insert(0);
      // System.out.println( arbol.height());
      //
      // System.out.println( "\n-----------------------------");
      // System.out.println( "finding the leaves" );
      // System.out.println(arbol.numLeaves());

      //main method for testing (FROM CLOSET)
          public static void main( String[] args ) {

      	BST arbol = new BST();

      	System.out.println( "tree init'd: " + arbol );

      	//inserting in this order will build a perfect tree
      	arbol.insert( 3 );
      	arbol.insert( 1 );
      	arbol.insert( 0 );
      	arbol.insert( 2 );
      	arbol.insert( 5 );
      	arbol.insert( 4 );
      	arbol.insert( 6 );
      	/*
      	*/

      	//insering in this order will build a linked list to left
      	/*
      	arbol.insert( 6 );
      	arbol.insert( 5 );
      	arbol.insert( 3 );
      	arbol.insert( 4 );
      	arbol.insert( 2 );
      	arbol.insert( 1 );
      	arbol.insert( 0 );
      	*/

      	System.out.println( "tree after insertions:\n" + arbol );
      	System.out.println();

      	System.out.println();
      	for( int i=-1; i<8; i++ ) {
      	    System.out.println(" searching for "+i+": " + arbol.search(i) );
      	}

      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(6);
      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(5);
      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(4);
      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(3);
      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(2);
      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(1);
      	System.out.println();
      	System.out.println( arbol );

      	arbol.remove(0);
      	System.out.println();
      	System.out.println( arbol );
    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
