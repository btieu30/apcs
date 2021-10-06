// Silencio: Melody Lew and Brianna Tieu
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05

/*
DISCO
 0. new is used to create a new object.
 1. When we use richard or any of the objects, it can use any method in BigSib.

QCC
 0. Is String greeting not an instance variable because it is not outside the method? What is the difference if a variable is an instance variable or not?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib(); //creates a new object
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib rachel = new BigSib();
    rachel.setHelloMsg("Salutations");
    
    greeting = rachel.greet("Dr. Spaceman");
    System.out.println(greeting);
    
    BigSib john = new BigSib();
    john.setHelloMsg("Hey ya");
    
    greeting = john.greet("Kong Fooey");
    System.out.println(greeting);
    
    BigSib jane = new BigSib();
    jane.setHelloMsg("Sup");
    
    greeting = jane.greet("mom");
    System.out.println(greeting);
    

  } //end main()
} //end Greet
