/**
 * Created by Corki on 2016/10/17 0017.
 */
public class Main1011 {
    public static void main(String[] args){
        for(int i=100;i<=999;i++){
            if(i==(i%10)*(i%10)*(i%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i/100)*(i/100)*(i/100)){
                System.out.println(i);
            }
        }
    }
}
