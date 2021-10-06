// Silencio - Brianna Tieu, Pepe, Melody Lew and Ollie
// APCS
// HW13 -- Where do BigSibs Come From?
// 2021-10-06

/* DISCOVERIES
0: You can use constructors instead of methods to execute code, making it look cleaner overall by avoiding even more tedious repeating lines of code.
1: By adding this constructor to our code, we are basically just combining the two lines from last night's Greet.java that declared the new instance variable and ran the method setHelloMsg.

QCC
0: Can the constructor take more than one input to make this code even more efficient?
*/

public class Greet {
    public static void main(String[] args) {
	String intro;

	BigSib test = new BigSib("Word up");
	intro = test.greet("freshman");
	System.out.println(intro);

	BigSib random = new BigSib("Salutations");
	intro = random.greet("Dr. Spaceman");
	System.out.println(intro);

	BigSib ducky = new BigSib("Hey ya");
	intro = ducky.greet("Kong Fooey");
	System.out.println(intro);

	BigSib stress = new BigSib("Sup");
	intro = stress.greet("mom");
	System.out.println(intro);
    } // end main
}// end Greet

