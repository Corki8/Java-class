import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1034 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            System.out.println(Isprime(cin.nextInt()));
        }
        cin.close();
    }

    private static int Isprime(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return 0;
        return 1;
    }
}
