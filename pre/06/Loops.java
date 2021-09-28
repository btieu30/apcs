public class Loops {

public static void main(String[] args) {
System.out.println(power(2.0, 3));
System.out.println(factorial(3));

//* When the absolute value of x gets larger, the result becomes less accurate //
double x = 0.1;
while (x <= 100.0) {
  check(x);
  x = x * 10;
}

x = -0.1;
while (x >= -100.0) {
  check(x);
  x = x * 10;
}

}

public static double power(double x, int n) {
  int i = 0;
  double start = 1.0;
  while (i < n) {
    start = start * x;
    i = i + 1;
    }
    return start;
}

public static int factorial (int n) {
  int i = 1;
  int start = 1;
  while (i <= n) {
    start = start * i;
    i += 1;
    }
    return start;
}

public static double myexp (double x, int n) {
  double i = 1.0;
  double y = 1.0;
  double end = 1.0;
  while (i <= n) {
    y = y * x / i;
    end = end + y;
    i += 1;
  }
  return end;
  }

public static void check (double x) {
  System.out.println(x + "\t" + myexp(x, 15) + "\t" + Math.exp(x));
}
}

