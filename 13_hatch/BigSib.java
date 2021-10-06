// Silencio -- Brianna Tieu, Pepe, Melody Lew and Ollie
// APCS
// HW13 -- Where do BigSibs Come From?
// 2021-10-06

/* DISCOVERIES
0: When using a constructor, it must be named after the class of the file, or else it won't work.

QCC
0: When naming the constructor something that wasn't the class name, there was an error message. Why must the constructor be named after the class?
*/

public class BigSib {
	String helloMsg;

    public BigSib (String greeting) {
	helloMsg = greeting;
    }

    public String greet (String x) {
	return (helloMsg + " " + x);
    }
}
