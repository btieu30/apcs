// Silencio -- Brianna Tieu, Pepe, Melody Lew and Ollie
// APCS
// HW13 -- Where do BigSibs Come From?
// 2021-10-06

// DISCOVERIES and QCC both in Greet.java

public class BigSib {
	String helloMsg;

    public BigSib (String greeting) {
	helloMsg = greeting;
    }

    public String greet (String x) {
	return (helloMsg + " " + x);
    }
}
