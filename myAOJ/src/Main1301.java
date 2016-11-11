import java.util.Scanner;

/**
 * Created by Corki on 2016/10/15 0015.
 */
public class Main1301 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {

            int a = cin.nextInt();
            System.out.println(a * a * a);
        }
        cin.close();
    }
}
