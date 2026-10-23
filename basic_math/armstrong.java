import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int c = 0;
        while(t>0){
            c++;
            t=t/10;
        }
        int r = 0;
        int t2 = n;
        while(t2>0){
            int d = t2 %10;
            r = r + (int)Math.pow((double)d,(double)c);
            t2 = t2 / 10;
        }
        if(r==n){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
