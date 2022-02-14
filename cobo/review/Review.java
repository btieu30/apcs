//Team Avocado: Brianna Tieu, Raven (Ruiwen) Tang

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();


  private static final String SPACE = " ";

  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }


  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }

  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }
  }

  /**
   * returns a string containing all of the text in fileName (including punctuation),
   * with words separated by a single space
   */
  public static String textToString( String fileName )
  {
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));

      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();

    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }

  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }

  public static double totalSentiment ( String fileName ) {
    String rev = textToString(fileName);
    double totSent = 0;
    while(rev.indexOf(" ") > -1){
	    totSent += sentimentVal(removePunctuation(rev.substring(0, rev.indexOf(" "))));
	    rev = rev.substring(rev.indexOf(" ") + 1, rev.length());
    }
    totSent += sentimentVal(removePunctuation(rev));
    return totSent;
  }

  public static int starRating (String fileName) {
    String rev = textToString(fileName);
    double total = totalSentiment(fileName);
    int wordCount = 0;
    while(rev.indexOf(" ") > -1){
	    wordCount += 1;
      rev = rev.substring(rev.indexOf(" ") + 1, rev.length());
    }
    wordCount += 1;
    if(total/wordCount >= 0.6){
    	return 5;
    }
    if(total/wordCount >= 0.3){
    	return 4;
    }
    if(total/wordCount >= 0){
    	return 3;
    }
    if(total/wordCount >= -0.3){
    	return 2;
    }
    if(total/wordCount >= -0.6){
    	return 1;
    }
    return 0;
  }

  public static String fakeReview(String fileName) {
    String rev = textToString(fileName) + " ";
    String next = "";
    String fake = "";
    String adj = "";
    String punct = "";
    boolean posRev = false;
    if(totalSentiment(fileName) > 0){
      posRev = true;
    }
    while (rev.indexOf("*") > -1) {
      fake += rev.substring(0, rev.indexOf("*"));
      rev = rev.substring(rev.indexOf("*"));
      adj = rev.substring(rev.indexOf("*"), rev.indexOf(" "));
      punct = getPunctuation(rev.substring(rev.indexOf("*"), rev.indexOf(" ")));
      if(posRev){
        if (sentimentVal(adj.substring(1)) <= 0) {
          fake += randomPositiveAdj() + punct;
          rev = rev.substring(rev.indexOf(" "));
        }
        else{
          fake += adj.substring(1);
          rev = rev.substring(rev.indexOf(" "));
        }
      }
      else{
        if (sentimentVal(adj.substring(1)) >= 0) {
          fake += randomNegativeAdj() + punct;
          rev = rev.substring(rev.indexOf(" "));
        }
        else{
          fake += adj.substring(1);
          rev = rev.substring(rev.indexOf(" "));
        }
      }
    }
    fake += rev;
    return fake;
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is none
   */
  public static String getPunctuation( String word )
  {
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }

    return word;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);

  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static void main(String[] args) {
    System.out.println("sentiment value of 'cheese': " + sentimentVal( "cheese" ));
    System.out.println("sentiment value of 'democracy' :" + sentimentVal( "democracy" ));
    System.out.println("sentiment value of 'Russia': " + sentimentVal( "Russia" ));
    System.out.println("sentiment value of 'computer': " + sentimentVal( "computer" ));
    System.out.println("total sentiment value of simple review: " + totalSentiment("SimpleReview.txt"));
    String[] simpReview = new String[21];
    simpReview[0] = "The";
    simpReview[1] = "food";
    simpReview[2] = "was";
    simpReview[3] = "good";
    simpReview[4] = "so";
    simpReview[5] = "it's";
    simpReview[6] = "too";
    simpReview[7] = "bad";
    simpReview[8] = "their";
    simpReview[9] = "service";
    simpReview[10] = "is";
    simpReview[11] = "awful";
    simpReview[12] = "Terrible";
    simpReview[13] = "service";
    simpReview[14] = "with";
    simpReview[15] = "the";
    simpReview[16] = "hostess";
    simpReview[17] = "who";
    simpReview[18] = "was";
    simpReview[19] = "passive";
    simpReview[20] = "aggressive";
    double check = 0;
    for(String s : simpReview){
    	check += sentimentVal(s);
    }
    System.out.println("total sentiment value of simple review, checking by sum: " + check);
    System.out.println("star rating of simple review: " + starRating("SimpleReview.txt"));
    System.out.println("star rating of another review: " + starRating("AnotherReview.txt"));
    System.out.println("generated review: " + fakeReview("SimpleReview.txt"));
  }
}