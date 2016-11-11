import java.util.Scanner;

/**
 * Created by corki on 16-10-20.
 */
public class Main1280 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            System.out.println(cin.nextInt() % 2 == 0 ? "yes" : "no");
        }
        cin.close();
    }
}
