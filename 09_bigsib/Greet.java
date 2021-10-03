/*
 Anything Goes:
 Brianna (Pepe), William (CS50DDB), Brian (Dolphin)

Discoveries: 
1) You can call a method in a different file and use it in the main method.
2) You call it by simply writing the file name the method is stored in, followed by the name of the method itself and put in any required inputs.

Unresolved Questions:
1) What does public indicate in front of a method/class file and how does it differ from private?
*/

public class Greet {
	public static void main(String[] args) {
		BigSib.greet("Film");
		BigSib.greet("Flam");
		BigSib.greet("Kazaam");
	}
}
