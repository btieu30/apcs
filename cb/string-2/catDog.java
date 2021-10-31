public class catDog {
  //given a string, return true if "cat" and "dog" appear the same number of times, false otherwise.

  public static boolean catDog (String str) {
    int countCat = 0;
    int countDog = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("cat")) {
        countCat++;
      }
    }
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("dog")) {
        countDog++;
      }
    }
    return (countCat == countDog);
    }

  public static void main(String[] args) {
    System.out.println(catDog("catdog")); //returns true
    System.out.println(catDog("catcat")); //returns false
    System.out.println(catDog("1cat1cadodog")); //returns true
  }
}
