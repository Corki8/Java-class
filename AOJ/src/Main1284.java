import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1284 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            System.out.println(a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ? "yes" : "no");
        }
        cin.close();
    }
}
