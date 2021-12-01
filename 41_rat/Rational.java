//Team ABA -- Ariella Katz, Alif Rahman, Brianna Tieu
//APCS
//HW41 -- Be Rational
//2021-12-01
//Time Spent: 0.5 hr

/*
DISCO:
0:

QCC:
0: What kind of protection should be used for ints p and q?
*/

public class Rational {
  protected int p;
  protected int q;

  public Rational() {
    p = 0;
    q = 1;
  }

  public Rational(int x, int y) {
    p = x;
    q = y;
  }

  public float floatValue() {
    float floatNum = ( (float) p / q);
    return floatNum;
  }

  public String toString() {
    String str = p + "/" + q;
    return str;
  }

  public void multiply ( Rational Q ) {
    this.p = this.p * Q.p;
    this.q = this.q * Q.q;
  }

  public void divide ( Rational Q ) {
    this.p = this.p * Q.q;
    this.q = this.q * Q.p;
  }

  public static void main(String[] args) {
    Rational test = new Rational(2, 3);
    Rational pog = new Rational(3, 4);
    System.out.println(test.floatValue());
    System.out.println(test);
    test.multiply(pog);
    System.out.println(test);
    test.divide(pog);
    System.out.println(test);
  }
}
