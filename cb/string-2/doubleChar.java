public class doubleChar {
  //given a string, returns a string where each character in the original is duplicated

public static String doubleChar(String str) {
  String finalChar = "";
  int i = 0;
  while (i <= str.length() - 1) {
    finalChar += str.substring(i, i + 1) + str.substring(i, i + 1);
    i++;
  }
  return finalChar;
  }

  public static void main(String[] args){
    System.out.println(doubleChar("The")); //returns "TThhee"
    System.out.println(doubleChar("AAbb")); //returns "AAAAbbbb"
    System.out.println(doubleChar("Hi-There")); //returns "HHii--TThheerree"
  }
}
