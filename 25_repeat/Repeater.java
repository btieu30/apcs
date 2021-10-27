//Team Hydration - Brianna, Pepe, Nicole, Duck
//APCS
//HW25 -- Do I repeat myself?
//2021-10-26
//Time Spent: 0.6 hours

/*
DISCO
0: Recursive functions call themselves within the body of code.
1: Base Cases are necessary for recursive functions to run.
2: When concatenating strings in recursive methods, we need variables to store the strings each time the string has an amendment.

QCC
0: What would be the difference between using recursive methods and loops in the end and in what situations would we choose one over the other?
*/

public class Repeater {

    public static String fenceW(int numPosts) {
      String start = "|";
      int i = 1;
      while (i < numPosts) {
        start += "--|";
        i++;
      }
      return start;
    }

    public static String fenceR(int numPosts) {
      String start = "|";
      if (numPosts == 1) {
        return start;
      } else {
          start = fenceR(numPosts - 1) + "--|";
        }
      return start;
  }

    public static void main ( String[] args ) {
      System.out.println("fenceW outputs: ");
      System.out.println(fenceW(1));
      System.out.println(fenceW(2));
      System.out.println(fenceW(3));

      System.out.println("\nfenceR outputs: ");
      System.out.println(fenceR(1));
      System.out.println(fenceR(2));
      System.out.println(fenceR(3));
    }
}
