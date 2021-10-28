//Team Hydration - Brianna, Pepe, Nicole, Duck
//APCS
//HW26 -- GCD Three Ways
//2021-10-27
//Time Spent: 0.5 hours

/*
DISCO
0: In all these loops, the main condition for the loops or if statements to exit would be for the two inputs to equal one another.

QCC
0: When I initially returned the value of i instead of creating variable gcd for the "brute force" method, it prompted the output to be the smallest common divisor. Does the return store the initial value of i and is creating a new variable necessary here?
1: Is there a built-in java function that also finds the lowest common divisor?

ALGO:
- To find the GCD, we compare the two imputs and continously replace the larger number with the positive difference of the two inputs. We repeat this until we get the same number, this being the GCD.
*/
public class Stats {

    public static int gcd( int a, int b) {
      int i = 1;
      int gcd = 1;
      if (a == b) {
        return a;
      } else {
        while ((i < a) && (i < b)) {
          i++;
          if ((a % i == 0) && (b % i == 0)) {
            gcd = i;
        }
      }
      return gcd;
    }
}
    public static int gcdER( int a, int b ) {
      if (a == b) {
        return a;
      } else {
        if (a > b) {
          a = gcdER((a - b), b);
        } else {
          a = gcdER(a, (b - a));
        }
        return a;
      }
    }

    public static int gcdEW( int a, int b ) {
      int i = 1;
      while (a != b) {
        if (a > b) {
          a = a - b;
        } else {
          b = b - a;
        }
      }
      return a;
    }

    public static void main(String[] args) {
      System.out.println("gcd test: ");
      System.out.println(gcd(3, 5));
      System.out.println(gcd(5, 5));
      System.out.println(gcd(16, 64));
      System.out.println(gcd(64, 16));
      System.out.println(gcd(18, 21));
      System.out.println(gcd(21, 18));

      System.out.println("\ngcdER test: ");
      System.out.println(gcd(3, 5));
      System.out.println(gcdER(5, 5));
      System.out.println(gcdER(16, 64));
      System.out.println(gcdER(64, 16));
      System.out.println(gcdER(18, 21));
      System.out.println(gcdER(21, 18));

      System.out.println("\ngcdEW test: ");
      System.out.println(gcd(3, 5));
      System.out.println(gcdER(5, 5));
      System.out.println(gcdEW(16, 64));
      System.out.println(gcdEW(64, 16));
      System.out.println(gcdEW(18, 21));
      System.out.println(gcdEW(21, 18));
    }
}
