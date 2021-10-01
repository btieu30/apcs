/*
Brianna Tieu
APCS
HW08 -- Refactor Freshie Zero
2021-09-30

Discoveries: 
1) You can easily concatenate strings in Java by simply using addition signs.
2) It is much more organized to declare a separate function outside of the main function, to stop clutter.

Unresolved Questions:
1) Are there any benefits to returning the output before printing it in main, or is it more efficient to directly use System.out.println in the function declaration?
2) Why does each function call have to begin with public static void and what is its role in Java?
*/

public class Greet {
	public static void main(String[] args){
		System.out.println(greet("Foo"));
		System,out.println(greet("Moo"));
		System.out.println(greet("Voo"));
	}

	public static String greet(String x){
		s1 = "Why, hello there, ";
		s2 = ". How do you do?";
		final = s1 + x + s2;
		return final;
	}
