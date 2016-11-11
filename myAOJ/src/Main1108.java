import java.util.Scanner;

/**
 * Created by corki on 16-10-25.
 */
public class Main1108 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int g = cin.nextInt();
            System.out.println(g > 100 || g < 0 ? "Score is error!" : g >= 90 && g <= 100 ? "A" : g >= 80 ? "B" : g >= 70 ? "C" : g >= 60 ? "D" : "E");

        }
        cin.close();
    }
}
