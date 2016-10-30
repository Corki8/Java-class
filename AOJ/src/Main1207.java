import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1207 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) break;
            System.out.println((n % 10) * (n % 10) * (n % 10) + (n / 10 % 10) * (n / 10 % 10) * (n / 10 % 10) + (n / 100) * (n / 100) * (n / 100) == n ? "Yes" : "No");
        }
        cin.close();
    }
}
