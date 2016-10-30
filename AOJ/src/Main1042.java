import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1042 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            System.out.println(F(N));
        }
        cin.close();
    }

    private static int F(int N) {
        return N == 0 ? 1 : F(N - 1) * N;
    }
}
