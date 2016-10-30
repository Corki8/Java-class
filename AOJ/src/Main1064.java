import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1064 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double r = cin.nextDouble();
            System.out.printf("%.3f\n", Math.PI * r * r * r * 4.0 / 3.0);
        }
        cin.close();
    }
}
