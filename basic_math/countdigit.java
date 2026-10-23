import java.util.*;
public class countdigit{
    public static void main(String args[]){
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            c++;
            n=n/10;
        }
        System.out.print(c);
    }
}