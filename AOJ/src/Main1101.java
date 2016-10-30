import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1101 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- != 0) {
            int a = cin.nextInt(), b = cin.nextInt();
            System.out.println((a + b) % 100);
        }
        cin.close();
    }
}
