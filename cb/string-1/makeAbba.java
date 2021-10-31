public class makeAbba {
  // given two strings (a, b), prints them in one final string formatted as abba.

public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }

  public static void main(String[] args) {
    System.out.println(makeAbba("Hi", "Bye")); //returns "HiByeByeHi"
    System.out.println(makeAbba("Yo", "Alice")); //returns "YoAliceAliceYo"
    System.out.println(makeAbba("What", "Up")); //returns "WhatUpUpWhat"
  }
}

