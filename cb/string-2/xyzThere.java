public class xyzThere {
  //given a string, returns true if "xyz" is present in the string, otherwise return false. If "xyz" is preceded by a period, also returns false.

  public static boolean xyzThere (String str) {
    boolean there = false;
    if ((str.length() >= 3) && str.substring(0, 3).equals("xyz")) {
      there = true;
      return there;
    }
    for (int i = 1; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("xyz") && !str.substring(i - 1, i).equals(".")) {
        there = true;
        return there;
      }
    }
    return there;
}
  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz")); //returns true
    System.out.println(xyzThere("abc.xyz")); //returns false
    System.out.println(xyzThere("xyz.abc")); //returns true
  }
}
