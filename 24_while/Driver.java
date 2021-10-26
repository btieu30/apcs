/***
Team Cheese - Brianna, Pepe, Brian, Vivian
APCS
HW24 -- Get It While You Can
2021-10-25
Time Spent: 1.3 hours;
***/

/*
DISCO
0: While loops utilize conditions to determine whether or not to run specific bodies of code.

QCC
0: When I ran the code with "&&" operators, why did it return errors?

POST-v0 MODS
0: Added reset function to default constructor
*/
public class Driver {

  public static void main( String[] args ) {
    Coin mine = new Coin();
    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );
    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

      int matchCtr = 0;
      int x = 10;
      int y = 15;

      while (x > (yours.getHeadsCtr() + wayne.getHeadsCtr()) || y > matchCtr || matchCtr < 65536 || matchCtr % 2005 != 0) {
        yours.flip();
        wayne.flip();
        if (yours.equals(wayne)) {
          matchCtr += 1;
        }
      }
  System.out.println("Total Flips: " + yours.getFlipCtr() + "\nTotal Matches: " + matchCtr + "\nTotal Heads Count: " + (yours.getHeadsCtr() + wayne.getHeadsCtr()));
  }//end main()

}//end class
