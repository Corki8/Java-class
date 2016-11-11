import java.util.Scanner;

/**
 * Created by corki on 16-10-25.
 */
public class Main1277 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long n = cin.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
        cin.close();
    }
}
