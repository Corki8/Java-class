import java.util.Scanner;

/**
 *Created by Corki on 2016/10/17 0017.
 */
public class Main1002 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            double a=cin.nextInt(),b=cin.nextInt(),c=cin.nextInt();
            System.out.printf("%.2f %.2f\n",(-b+Math.sqrt(b*b-4*a*c))/a/2.0,(-b-Math.sqrt(b*b-4*a*c))/a/2.0);
        }
    }
}
