import java.util.Scanner;

/**
 * Created by Corki on 2016/10/16 0016.
 */
public class Main1312 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            StringBuffer s = new StringBuffer(cin.nextLine());
            System.out.println(s.reverse());
        }
        cin.close();
    }
}