import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1041 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double n = cin.nextDouble(), t = 0;
            while (n != 0) {
                t += 1.0 / n--;
            }
            System.out.printf("%.6f\n", t);
        }
        cin.close();
    }
}