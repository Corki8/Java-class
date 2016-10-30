import java.util.Scanner;

/**
 * Created by corki on 16-10-25.
 */
public class Main1282 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            System.out.printf("%.2f\n", Math.abs(cin.nextFloat()));
        }
        cin.close();
    }
}
