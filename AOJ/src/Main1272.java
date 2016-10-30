import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1272 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(n % 10 * 100 + n / 10 % 10 * 10 + n / 100);
        }
        cin.close();
    }
}
