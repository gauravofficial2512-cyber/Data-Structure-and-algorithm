import java.util.*;
public class pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =0;
        int k3 = 0;
        int k1 = 0;
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                for(int j=1;j<=n-1-k;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                }
                System.out.println();
                k++;
            }else{
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
}
