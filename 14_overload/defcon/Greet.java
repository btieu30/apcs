// Giant Pigs: Brianna Tieu, Melody Lew, Weichen Liu, Pepe, Ollie, Blueface
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/* DISCO
0: We overload a constructor as opposed to keeping a default constructor, we can pass different arguments within code to customize in this case, our greeting message.
QCC
0: Is there a way to print the greetings without having the same beginning of Word up?
*/

public class Greet {
    public static void main(String[] args) {
        String greeting;

        BigSib richard = new BigSib();
        BigSib tracy = new BigSib();
        BigSib grizz = new BigSib();
        BigSib dotCom = new BigSib();

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
