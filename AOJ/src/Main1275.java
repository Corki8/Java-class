import java.util.Scanner;

/**
 * Created by corki on 16-10-20.
 */
public class Main1275 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
            System.out.printf("%.3f\n", (a + b + c) / 3.0);
        }
        cin.close();
    }
}
