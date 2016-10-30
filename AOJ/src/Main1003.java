import java.util.Scanner;

/**
 * Created by corki on 16-10-22.
 */
public class Main1003 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.nextLine();
            System.out.println(s.replaceAll("[^a-zA-Z]", ""));//here
        }
        cin.close();
    }
}
