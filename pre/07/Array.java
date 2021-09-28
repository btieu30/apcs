import java.util.Arrays;

public class Array {

public static void main(String[] args) {
  double[] a = new double[] {1.0, 2.0, 3.0, 4.0};
  int[] b = new int[] {0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 4};
  int [] c = new int[] {1, 25, 20, 5, 16, 72};
  System.out.println(Arrays.toString(powArray(a, 2)));
  System.out.println(Arrays.toString(histogram(b, 5)));
  System.out.println(indexOfMax(c));
  System.out.println(Arrays.toString(sieve(20)));
}

public static double[] powArray (double a[], int n) {
  double[] x = new double[a.length];
  for(int i = 0; i < a.length; i++) {
    x[i] = Math.pow(a[i], n);
  }
  return x;
}

public static int[] histogram (int[] scores, int counters) {
  int[] counts = new int [counters];
  for (int score : scores) {
    counts[score]++;
  }
  return counts;
}

public static int indexOfMax (int[] integers) {
  int index = integers[0];
  int largest = 0;
  for (int i = 1; i < integers.length; i++) {
    if (integers[i] > index) {
      index = integers[i];
      largest = i;
      }
    }
    return largest;
  }
//* No, you cannot make this with an enhanced for loop, as with an enhanced for loop you are not anle to refer to the index.//

public static boolean [] sieve (int n) {
  boolean [] torf = new boolean [n + 1];
  for (int i = 2; i <= n; i++) {
    torf[i] = true;
  }

  for (int x = 2; x * x <= n; x++) {
    if (torf[x] == true) {
      for (int y = x; y * x <= n; y ++) {
        torf[x * y] = false;
      }
    }
  }
  return torf;
}

}

