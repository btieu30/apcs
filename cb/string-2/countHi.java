public class countHi {
  //given a string, returns the number of times "hi" appears in the string.

  public static int countHi (String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals ("hi")) {
        count++;
    }
  }
  return count;
}

  public static void main(String[] args) {
    System.out.println(countHi("abc hi ho")); //returns 1
    System.out.println(countHi("ABChi hi")); //returns 2
    System.out.println(countHi("hihi")); //returns 2
  }
}
