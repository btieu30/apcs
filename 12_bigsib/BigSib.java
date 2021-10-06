// Silencio -- Melody Lew and Brianna Tieu
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05

/*
DISCO
0. Since instance variables are non-static, we don't have static in our header.
QCC
0. What exactly does static mean?
1. Why do we need static when we are not using instance variables?
2. Why when we tried Msg = HelloMsg, did we get null in front of every line we tried to print?
*/

public class BigSib {
    String HelloMsg; //instance variable HelloMsg in class BigSib

    public void setHelloMsg(String Msg){
                HelloMsg = Msg;
        }

    public String greet(String x) {
        return(HelloMsg + " " + x);
    }
}
