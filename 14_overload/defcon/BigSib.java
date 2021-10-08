// Giant Pigs: Brianna Tieu, Melody Lew, Weichen Liu, Pepe, Ollie, Blueface
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/* DISCO
0: Default constructors cannot take any inputs, so it prevents the customization of our greetings.
QCC
0: Is there a possible way to customize the final greeting messages with the names using default constructor BigSib?
*/

public class BigSib {
	String helloMsg;

	public BigSib() {
		helloMsg = "Word up";
	}
// Deafult constructors don't take any inputs, so this prevents the custimization of our greet.

	public String greet (String x) {
		return (helloMsg + " " + x);
     }//end main
   }// end Greet

