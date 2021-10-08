// Giant Pigs: Brianna Tieu, Melody Lew, Weichen Liu, Pepe, Ollie, Blueface
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/* DISCO
0: The constructor BigSib allows us to take user input and cut down repetitive lines of code.
QCC
0: Why does the constructor need to be named after the class?
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
