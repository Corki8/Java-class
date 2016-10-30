import java.util.Scanner;

/**
 * Created by corki on 16-10-25.
 */
public class Main1240 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- != 0) {
            int a = cin.nextInt(), b = cin.nextInt();
            System.out.println(a + b);
        }
        cin.close();
    }
}
