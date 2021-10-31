public class endOther {
  //given two strings, return true if either of the strings appears at the end of the other, false otherwise, not case sensitive

  public static boolean endOther (String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() > b.length()) {
      String newA = a.substring(a.length() - b.length(), a.length());
      if (newA.equals(b)) {
        return true;
      } else {
        return false;
      }
    } else {
      String newB = b.substring(b.length() - a.length(), b.length());
      if (newB.equals(a)){
        return true;
      } else {
        return false;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(endOther("Hiabc", "abc")); //returns true
    System.out.println(endOther("AbC", "HiaBc")); //returns true
    System.out.println(endOther("abc", "abXabc")); //returns true
  }
}
