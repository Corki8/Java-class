import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1019 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int[] a = new int[4];
            for (int i = 0; i < 4; i++)
                a[i] = cin.nextInt();
            Arrays.sort(a);
            System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
        }
        cin.close();
    }
}
