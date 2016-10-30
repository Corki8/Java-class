import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1201 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int m = cin.nextInt(), n = cin.nextInt(), count = 0;
            while (m <= n) if (m++ % 15 == 0) count++;
            System.out.println(count);
        }
        cin.close();
    }
}
