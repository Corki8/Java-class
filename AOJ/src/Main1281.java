import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1281 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt() * 95;
            System.out.printf("%.2f\n", n >= 300 ? n * 0.85 : n);
        }
        cin.close();
    }
}
