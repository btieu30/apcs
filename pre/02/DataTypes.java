import java.util.Scanner;
public class DataTypes {

    public static void main(String[] args) {

//Exercise 2 of Think Java 2
String day = "Thursday";
int number = 19;
String month = "August ";
int year = 2021;

String american;
String european;

american = day + ", " + month + number + ", " + year;
System.out.println(american);

european = day + " " + number + " " + month + year;
System.out.println(european);

// Exercise 3 of Think Java 2
int hour = 22;
int minute = 15;
int second = 20;

int sinceMidnight;
sinceMidnight = (22 * 3600) + (15 * 60) + (20);
System.out.println(sinceMidnight);

int secRemaining;
secRemaining = (24 - hour)* 3600 + (60 - minute)* 60 + second;
System.out.println(secRemaining);

int hour2 = 22;
int minute2 = 26;
int second2 = 53;

int timeElapsed;
timeElapsed = (hour2 - hour)* 3600 + (minute2 - minute)* 60 + second;
System.out.println(timeElapsed);

//Exercise 3 of Think Java 3
int seconds;
int hours;
int minutes;
int seconds2;
int SEC_PER_HOUR = 3600;

  Scanner in = new Scanner(System.in);
  System.out.print("Input a number of seconds: ");
  seconds = in.nextInt();


  hours = seconds / SEC_PER_HOUR;
  minutes = (seconds / 60) % 60;
  seconds2 = seconds % 60;

  System.out.print(seconds + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds2 + " seconds.");
    }
}

