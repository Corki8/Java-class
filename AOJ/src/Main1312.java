import java.util.Scanner;

/**
 * Created by Corki on 2016/10/16 0016.
 */
public class Main1312 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            String s=cin.nextLine();
            for(int i=0;i<s.length();i++) {
                System.out.print(s.charAt(s.length()-1-i));
            }
            System.out.println();
        }
    }
}