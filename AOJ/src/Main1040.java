import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1040 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            /*
                 int sum=0;
              while (N!=0) {
                sum += N % 2 == 0 ?0:N;
                  N--;
                  }
                System.out.println(sum);
             */

            System.out.println(((N + 1) / 2) * ((N + 1) / 2));
        }
        cin.close();
    }
}
/*
note:
      1   3   5   7   9   11
      0   1   2   3   4   5
      1   2   3   4   5   6
 */
