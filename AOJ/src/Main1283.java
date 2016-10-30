import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1283 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
            System.out.println(a + b > c && a + c > b && b + c > a ? (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a ? "yes" : "no") : "not a triangle");
        }
        cin.close();
    }
}
