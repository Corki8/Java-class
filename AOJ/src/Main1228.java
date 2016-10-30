import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Corki on 2016/10/15 0015.
 */
public class Main1228 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            BigInteger n = cin.nextBigInteger();
            System.out.println(fact(n));
        }
        cin.close();
    }

    private static BigInteger fact(BigInteger n) {  //factorial
        return n.equals(BigInteger.ONE) ? BigInteger.ONE : n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
}
