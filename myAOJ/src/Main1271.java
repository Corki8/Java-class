import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1271 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double r = cin.nextDouble(), h = cin.nextDouble();
            System.out.printf("Area=%.3f\n", Math.PI * r * r * 2 + 2 * Math.PI * r * h);
        }
        cin.close();
    }
}
