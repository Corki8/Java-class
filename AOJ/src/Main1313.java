import java.util.Scanner;

/**
 * Created by Corki on 2016/10/16 0016.
 */
public class Main1313 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            for (int i = 1; i <= N; i++) {
                if (In_seven(i) || i % 7 == 0)
                    System.out.println(i);
            }
        }
        cin.close();
    }

    private static boolean In_seven(int n) {  //0-3000含有7
        return n == 0 ? false : (n % 10 == 7 ? true : In_seven(n / 10));
    }
}