import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int t = n;
        while(t>0){
            int d = t % 10;
            rev = rev*10 + d;
            t = t /10;
        }
        if(rev==n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
