import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Corki on 2016/10/25 0025.
 */
public class Main1274 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[3];
        while (cin.hasNext()) {
            a[0] = cin.nextInt();
            a[1] = cin.nextInt();
            a[2] = cin.nextInt();
            Arrays.sort(a);
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
        cin.close();
    }
}