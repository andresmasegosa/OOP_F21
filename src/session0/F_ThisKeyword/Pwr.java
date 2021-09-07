package session0.F_ThisKeyword;

/**
 * This class computes a number raised to the power of some integer.
 */
public class Pwr {
    double b;   //base number
    int e;      //exponent number
    int val;    //Result of b^e

    public Pwr(double b, int e) {
        this.b = b;
        this.e = e;
        this.val=1;
        for (int i = 0; i < e; i++) {
            val*=b;
        }
    }

    public int getPwr() {
        return val;
    }

    public static void main(String[] args) {
        Pwr pwr = new Pwr(2.4, 3);

        System.out.println("Result: " + pwr.getPwr());
    }
}
