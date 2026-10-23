import java.util.*;
public class pattern17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n-1;
        int k = 0;
        for(int i=1;i<=n;i++){
            char a = 'A';
            for(int j=1;j<=s-k;j++){
                System.out.print("  ");
            }
            k++;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            a--;
            a--;
            if(a>='A'){
                for(int j=1;j<=i-1;j++){
                    System.out.print(a+" ");
                    a--;
                }
            }
            System.out.println();
        }
    }
}
