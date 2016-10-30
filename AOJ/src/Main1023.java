import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1023 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int max = cin.nextInt();
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == -1) break;
            if (max < n) max = n;
        }
        System.out.println(max);
        cin.close();
    }
}
