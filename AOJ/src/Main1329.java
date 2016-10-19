import java.util.Scanner;

/**
 * Created by Corki on 2016/10/16 0016.
 */
public class Main1329 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int n=cin.nextInt(),h=cin.nextInt(),count=n;
            for(int i=0;i<n;i++){
                if(cin.nextInt()>h){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
