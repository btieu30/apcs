public class helloName {
//returns greeting in form of "Hello cheese!", given string name "cheese"
  public static String helloName(String name) {
    return "Hello " + name + "!";
  }

  public static void main(String[] args) {
    System.out.println(helloName("Bob")); //returns "Hello Bob!"
    System.out.println(helloName("Alice")); //returns "Hello Alice!"
    System.out.println(helloName("X")); //returns "Hello X!"
  }
}
