// Giant Pigs: Brianna Tieu, Melody Lew, Weichen Liu, Pepe, Ollie, Blueface
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/* DISCO
0: Each instance of BigSib or every time it is used to create a new object, it has its own value of the String greeting.
QCC
0: Is there another way to modify the constructor so that it can also take the user's name input?
*/

public class Greet {
    public static void main(String[] args) {
	String greeting;

	BigSib richard = new BigSib("Word up");
	BigSib tracy = new BigSib("Salutations");
	BigSib grizz = new BigSib("Hey ya");
	BigSib dotCom = new BigSib("Sup");

	greeting = richard.greet("freshman");
	System.out.println(greeting);


	greeting = tracy.greet("Dr.Spaceman");
	System.out.println(greeting);

	greeting = grizz.greet("Kong Fooey");
	System.out.println(greeting);

	greeting = dotCom.greet("mom");
	System.out.println(greeting);
     }// end main()
   }// end Greet

