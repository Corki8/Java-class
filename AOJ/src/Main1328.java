import java.util.Scanner;
/**
 *Created by Corki on 2016/10/16 0016.
 */
public class Main1328 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.nextLine();
            s = s.toLowerCase();
            char[] ss = s.toCharArray();
            if (ss[0] >= 'a' && ss[0] <= 'z')
                ss[0] -= 32;
            System.out.println(ss);
        }
    }
}