import java.util.Scanner;

/**
 * Created by corki on 16-10-26.
 */
public class Main1063 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int x1 = cin.nextInt(), y1 = cin.nextInt(), x2 = cin.nextInt(), y2 = cin.nextInt();
            System.out.printf("%.2f\n", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
        }
        cin.close();
    }
}
