import java.util.Scanner;

/**
 * Created by Corki on 2016/10/16 0016.
 */
public class Main1010 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(n == (n % 10) * (n % 10) * (n % 10) + (n / 10 % 10) * (n / 10 % 10) * (n / 10 % 10) + (n / 100) * (n / 100) * (n / 100) ? 1 : 0);
        }
        cin.close();
    }
}
