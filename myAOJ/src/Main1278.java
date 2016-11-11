import java.util.Scanner;

/**
 * Created by corki on 16-10-25.
 */
public class Main1278 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double n = cin.nextDouble();
            System.out.printf("%.3f %.3f\n", Math.sin(n * Math.PI / 180), Math.cos(n * Math.PI / 180));
        }
        cin.close();
    }
}
