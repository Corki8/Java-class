import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1242 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            if (a == 0 && b == 0) break;
            System.out.println(a + b);
        }
        cin.close();
    }
}
