public class countCode {
  //given a string, returns the number of times "code" appears in the string, but any letter can replace "d" in string "code"
  public static int countCode (String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 3; i++){
      if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countCode("aaacodebbb")); // returns 1
    System.out.println(countCode("codexxcode")); // returns 2
    System.out.println(countCode("cozexxcope")); // returns 2
  }
}
