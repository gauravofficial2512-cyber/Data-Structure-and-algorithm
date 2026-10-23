import java.util.*;
public class pattern15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i=1;i<=n;i++){
            char a = 'A';
            for(int j=1;j<=n-k;j++){
                System.out.print(a+" ");
                a++;
            }
            k++;
            System.out.println();
        }
    }
}
