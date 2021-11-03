/***
 * Team Hollister - Brianna, Pepe, Fang, Cat, Nicole, Duck
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-03
 * time spent: 0.3 hrs
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

 /*
 DISCO:
0: We can call existing methods in a class file to help us write new ones.
1: We use for loops when the number of iterations through the loop are unknown. Specifically in this class Pig, the length of the input string from the user varies. so we would want to use for loops instead of while loops.
 QCC:
0: Would there be a more efficient way to use the methods within one another to write an even shorter code for allVowels or countVowels?
 */

public class Pig
{
  //Q: How does this initialization make your life easier?
  //This initialization makes our lives easier because it allows us to call previous methods within new ones. For example, we can use hasA to write isAVowel. as we are simply checking if the input letter is in the String of VOWELS.
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    for(int i = 0; i < w.length(); i++) {
      if (w.substring(i, i + 1).equals(letter)) {
        return true;
      }
    }
    return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    return hasA(VOWELS, letter);
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int count = 0;
    for (int i = 0; i < w.length(); i++) {
      if (isAVowel(w.substring(i, i + 1)) == true) {
        count++;
      }
    }
    return count;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    if (countVowels(w) >= 1) {
      return true;
    }
    return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    String vowels = "";
    for (int i = 0; i < w.length(); i++){
      if(isAVowel(w.substring(i, i + 1)) == true) {
        vowels += w.substring(i, i + 1);
      }
    }
    return vowels;
  }


  public static void main( String[] args )
  {
    System.out.println(hasA("cat", "a"));
    System.out.println(hasA("cat", "p"));
    System.out.println(isAVowel("a"));
    System.out.println(isAVowel("b"));
    System.out.println(countVowels("meatball"));
    System.out.println(countVowels("cheese"));
    System.out.println(hasAVowel("cat"));
    System.out.println(hasAVowel("zzz"));
    System.out.println(allVowels("meatball"));
    System.out.println(allVowels("cheese"));

  }//end main()

}//end class Pig
