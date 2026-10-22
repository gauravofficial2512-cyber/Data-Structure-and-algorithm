import java.util.*;
public class pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k3 = 0;
        int k1 = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*n-1-k3;j++){
                System.out.print("* ");
            }
            k3=k3+2;
            k1++;
            System.out.println();
        }
    }
}
