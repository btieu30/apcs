
/*
Team Avocado: Brianna Tieu, Raven (Ruiwen) Tang
APCS
Lab06 -- Read/Review/Expand - cobo review lab
2022-02-13
time spent: 2.0
*/
import java.util.Scanner;

public class OpenEnded {
  // private String _upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  // private String _lower = "abcdefghijklmnopqrstuvwxyz";
  private String _numbers = "0123456789";
  private String _symbols = "!@#$%^&*?";

  public static void welcome() {
    System.out.println("Welcome to the valid password checker!\n A password is determined to be valid as long as it contains the following:");
    System.out.println("\n  -at least one capital letter \n  -at least one lowercase letter \n  -at least one special character \n  -at least one number");
    System.out.println("\nEnter a password to determine whether it is valid or not!");
    System.out.println("\nUser's Password:");
  }

  public static String check(String password) {
    int upperCount = 0;
    int lowerCount = 0;
    int numberCount = 0;
    int symbolCount = 0;
    password = password.trim();
    for (int i = 0; i < password.length(); i++) {
        if (Character.isUpperCase(password.charAt(i))) {
          upperCount++;
      }
    }
    for (int i = 0; i < password.length(); i++) {
        if (Character.isLowerCase(password.charAt(i))) {
          lowerCount++;
      }
    }
    for (int i = 0; i < password.length(); i++) {
        if (password.indexOf(password.charAt(i)) != -1) {
          numberCount++;
        }
    }
    for (int i = 0; i < password.length(); i++) {
      if (password.indexOf(password.charAt(i)) != -1) {
        symbolCount++;
      }
    }
    if (upperCount > 0 && lowerCount > 0 && numberCount > 0 && symbolCount > 0) {
      return "Your password is valid!";
    } else {
      return "Your password is invalid!";
    }
  }

public static void main(String[] args) {
  welcome();
  Scanner s = new Scanner(System.in);
  String pass = s.next();
  System.out.println(check(pass));
}

}//end OpenEnded
