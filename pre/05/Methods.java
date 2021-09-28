public class Methods {

public static void main(String[] args) {
  System.out.println(isDivisible(4, 2));
  System.out.println(isDivisible(4, 3));
  System.out.println(isTriangle(3, 4, 5));
  System.out.println(isTriangle(3, 4, 9));
  System.out.println(ackermann(1,2));
}

public static boolean isDivisible(int n, int m) {
if ((n % m) == 0) {
return true;
} else {
  return false;
}
}

public static boolean isTriangle(int a, int b, int c) {
  if (a + b < c || a + c < b || b + c < a) {
  return false;
  } else {
      return true;
  }
}

public static int ackermann(int m, int n) {
  if (m == 0) {
    return n + 1;
  } else {
      if (m > 0 && n == 0) {
        return ackermann(m - 1, 1);
      } else {
        return ackermann(m - 1, ackermann(m, n - 1));
}
}
}

}

