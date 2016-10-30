import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1309 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double a = cin.nextDouble(), b = cin.nextDouble(), c = cin.nextDouble();
            double s = (a + b + c) / 2.0;
            if (a + b > c && a + c > b && b + c > a)
                System.out.printf("%.2f\n", Math.sqrt(s * (s - a) * (s - b) * (s - c)));
            else
                System.out.println("Input error!");
        }
        cin.close();
    }
}
