public class loopsPractice {

public static void main(String[] args) {
  System.out.println(stringTimes("Hi", 2));
  System.out.println(stringTimes("Hi", 3));
  System.out.println(stringTimes("Hi", 1));
}

public static String stringTimes (String str, int n) {
  String newString = "";
  for (int i = 0; i < n; i++) {
    newString = newString + str;
    }
    return newString;
  }
}
