import java.util.*;
public class largestdigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(n>0){
            int d = n % 10;
            max = Math.max(max,d);
            n = n / 10;
        }
        System.out.print(max);
    }
}
