import java.util.Scanner;

/**
 * Created by Corki on 2016/10/17 0017.
 */
public class Main1332 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            no(a, b, 3);
        }
        cin.close();
    }

    private static void no(int a, int b, int n) {
        int[] d = new int[n];
        d[0] = 1;
        int term, carry;
        for (int i = 0; i < b; i++) {
            carry = 0;                 //进位在此处清零
            for (int j = 0; j < n; j++) {
                term = d[j] * a + carry;
                d[j] = term % 10;
                carry = term / 10;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(d[i]);
        }
        System.out.println();
    }
}
