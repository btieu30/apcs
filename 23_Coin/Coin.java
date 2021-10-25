/***
 *  class Coin - SKELETON
 *  Team Cheese - Brianna, Pepe, Brian, and Vivian
 *  APCS
 *  HW23 - What Does Equality Look Like?
 *  2021-10-25
 *  Time Spent: 1.2 hours
 ***/

/*
DISCO:
  0: You can create a new class instance in the parameters of a method.
  1: Math.random can generate a value between 0.0 (inclusive) and 1.0 (exclusive).
  2: The built in .equals java method can compare objects (e.g. strings) while the == operator can compare primitive values (e.g. int, double, etc.).

QCC:
  0: Is there a proper test to determine whether or not the java method Math.random() is actually random?
  1: Are accessors often used in code to determine if our variables have reasonable values?
  2: Is there a way to change the interval in which random numbers are generated for Math.random()?
  3: Why does the == operator also work when we compare strings? Is this always the case and is it better to use .equals over the "==" operator? Why?

*/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;

  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    reset("heads", 0.5);
    bias = Math.random();
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    bias = Math.random();
    name = s;
    if (bias <= 0.5) {
      upFace = "tails";
    } else {
      upFace = "heads";
    }
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    name = s;
    upFace = nowFace;
    assignValue(s);
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/

  private double assignValue( String s ) {
    if ( s.equals ("penny") ) {
      value = 0.01;
    } else if ( s.equals ("nickel") ) {
        value = 0.05;
    } else if ( s.equals ("dime") ) {
        value = 0.10;
    } else if ( s.equals ("quarter") ) {
        value = 0.25;
    } else if ( s.equals ("half dollar") ) {
        value = 0.50;
    } else if ( s.equals ("dollar") ) {
        value = 1.00;
    } else {
        value = 0.00;
    }
    return value;
  }

  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    upFace = s;
    bias = d;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    if ( bias <= Math.random() ) {
      flipCtr += 1;
      tailsCtr += 1;
      upFace = "tails";
    } else {
      flipCtr += 1;
      headsCtr += 1;
      upFace = "heads";
    }
      return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    if ( upFace == other.upFace ) {
      return true;
    } else {
      return false;
    }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    String x = name + ": " + upFace;
    return x;
  }

}//end class
