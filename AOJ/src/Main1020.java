import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1020 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = cin.nextInt() * (-1);   //input
        Arrays.sort(a);
        for (int i = 0; i < 10; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(a[i] * (-1));      //output
        }
        cin.close();
    }
}
