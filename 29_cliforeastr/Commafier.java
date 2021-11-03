//Team Hydration: Brianna + Nicole
//APCS
//HW29 -- Which Way Do You Roll?
//2021-11-02
//Time Spent: 1.0 hours

/*
DISCO:
0: We can use for each loops or enhanced for loops to allow us to account for each argument in the main method or in arrays.
1: We can use Integer.parseInt() to return an integer from a string.
2: Integer.toString can be used to return the string representation of an integer.

QCC:
0: How can we parse through a string and turn it into an integer representation?
*/

public class Commafier {

  public static String commafyR (int r) {
    String commafied = Integer.toString(r);
    int x = commafied.length();
    if (x < 4) {
      return commafied;
    } else {
      return (commafyR(Integer.parseInt(commafied.substring(0, x - 3))) + "," + commafied.substring(x - 3));
    }
  }

  public static String commafyF (int f) {
    String commafied = Integer.toString(f);
    if (commafied.length() < 4) {
      return commafied;
    } else {
        for (int i = 3; i <= commafied.length(); i+= 4) {
          commafied = commafied.substring(0, commafied.length() - i) + "," + commafied.substring(commafied.length() - i);
    }
  }
    return commafied;
}

  public static void main(String[] args) {
/*
    System.out.println("Recursive Method Calls:");
    System.out.println(commafyR(1));
    System.out.println(commafyR(10));
    System.out.println(commafyR(101));
    System.out.println(commafyR(1000));
    System.out.println(commafyR(12345));

    System.out.println("\nIterative Method Calls:");
    System.out.println(commafyF(1));
    System.out.println(commafyF(10));
    System.out.println(commafyF(101));
    System.out.println(commafyF(1000));
    System.out.println(commafyF(12345));
*/
    for (String s : args) {
      System.out.println(commafyR(Integer.parseInt(s)));
      System.out.println(commafyF(Integer.parseInt(s)));
    }
  }
}
