import java.util.Scanner;

/**
 * Created by Corki on 2016/10/16 0016.
 */
public class Main1206 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int M = cin.nextInt();
        while (M-- != 0) {//控制输入组数
            int N = cin.nextInt(), sum = 0;
            while (N-- != 0) {//控制组内元素个数
                int n = cin.nextInt();
                if (Isprime(n))
                    sum += n;

            }
            System.out.println(sum);
        }
        cin.close();
    }

    private static boolean Isprime(int n) {//判断素数
        if (n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
