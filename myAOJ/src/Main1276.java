import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1276 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            System.out.printf("%.3f\n", 5 * (cin.nextDouble() - 32) / 9);
        }
        cin.close();
    }
}
