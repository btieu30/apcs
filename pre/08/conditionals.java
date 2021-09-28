public class conditionalsPractice {

public static void main(String[] args) {
  System.out.println(oddsAreNegated(1));
  System.out.println(oddsAreNegated(0));
  System.out.println(oddsAreNegated(2));

  System.out.println(noTeenSum(1, 2, 3));
  System.out.println(noTeenSum(2, 13, 1));
  System.out.println(noTeenSum(2, 1, 14));
}

public static int oddsAreNegated (int x) {
  if (x % 2 == 0) {
    return x;
  } else {
    return -x;
  }
}

public static int noTeenSum (int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public static int fixTeen (int n) {
  if ((n >= 13 && n < 15) || (n >= 17 && n <= 19)) {
    return 0;
  } else {
    return n;
  }
}

}
