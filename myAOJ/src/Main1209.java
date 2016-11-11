import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1209 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double U = cin.nextDouble(), D = cin.nextDouble(), H = cin.nextDouble();
            System.out.printf("%.2f\n%.2f\n", (U + D) * H / 2.0, 2 * Math.sqrt(H * H + (D - U) * (D - U) / 4.0) + U + D);
        }
        cin.close();
    }
}
