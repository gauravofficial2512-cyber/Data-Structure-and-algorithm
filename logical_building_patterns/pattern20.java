import java.util.*;
public class pattern20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2*n-2;
        int k=n-1;
        int s2 = 2;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");

                }
                for(int j=1;j<=s;j++){
                    System.out.print("  ");
                }
                s=s-2;
                for(int j=i;j>=1;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=1;j<=k;j++){
                    System.out.print("* ");
                }
                
                for(int j=1;j<=s2;j++){
                    System.out.print("  ");
                }
                s2=s2+2;
                for(int j=k;j>=1;j--){
                    System.out.print("* ");
                }
                k--;
                System.out.println();
            }
        }
        

    }
}