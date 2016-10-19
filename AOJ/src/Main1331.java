import java.util.Scanner;

/**
 * Created by Corki on 2016/10/17 0017.
 */
public class Main1331 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t=cin.nextInt();
        while (t--!=0){
            int M=cin.nextInt(),N=cin.nextInt();
            int[][] a = new int[M][N];
            for(int i=0;i<M;i++)//input
                for(int j=0;j<N;j++)
                    a[i][j]=cin.nextInt();
            boolean flag=true;
            for(int i=1;i<M-1;i++)
                for(int j=1;j<N-1;j++)
                    if(a[i][j]>a[i-1][j]&&a[i][j]>a[i+1][j]&&a[i][j]>a[i][j-1]&&a[i][j]>a[i][j+1]){
                        System.out.println(a[i][j]+" "+(i+1)+" "+(j+1));
                        flag=false;
                    }
                    if(flag)
                        System.out.println("None "+M+" "+N);
        }
    }
}
