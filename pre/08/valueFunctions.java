public class valueFunctions {

public static void main(String[] args) {
  System.out.println(force(1.0, 1.0, 1.0, 1.0));
  System.out.println(force(2.0, 3.0, 4.0, 1.0));
  System.out.println(force(2.0, 3.0, 4.0, 2.0));

  System.out.println(average3(0, 0, 0));
  System.out.println(average3(1, 3, 4));
  System.out.println(average3(0, 2, 4));

  System.out.println(sumOfSines(0.0));
  System.out.println(sumOfSines(30.0));
  System.out.println(sumOfSines(45));
}

public static double force (double g, double m1, double m2, double r) {
  double massProduct = m1 * m2;
  double product = massProduct * g;
  double finalForce = product / (r * r);
  return finalForce;
}

public static double average3 (int a, int b, int c) {
  return (a + b + c) / 3;
}

public static double sumOfSines (double t) {
  double degrees2 = (t * Math.PI) / 180;
  double degrees3 = (t * Math.PI) / 180;
  double radians2 = degrees2 * 2;
  double radians3 = degrees3 * 3;
  double sum = Math.sin(radians2) + Math.sin(radians3);
  return Math.round(sum * 1000.0) / 1000.0;
}

}

