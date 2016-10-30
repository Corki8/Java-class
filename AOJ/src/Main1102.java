import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1102 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            int sum1 = 0, sum2 = 0;
            for (int i = a; i <= b; i++)
                if (i % 2 == 0)
                    sum1 += i * i;
                else
                    sum2 += i * i * i;
            System.out.println(sum1 + " " + sum2);
        }
        cin.close();
    }
}
