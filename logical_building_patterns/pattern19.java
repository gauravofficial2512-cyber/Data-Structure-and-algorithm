import java.util.*;
public class pattern19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int s2 = 2*n-2;
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=s;j++){
                    System.out.print("  ");
                }
                s=s+2;
                for(int j=n-i+1;j>=1;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            
            else{
                
                for(int j=1;j<=i-n;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=s2;j++){
                    System.out.print("  ");
                }
                for(int j=i-n;j>=1;j--){
                    System.out.print("* ");
                }
                System.out.println();
                s2=s2-2;

            }
        }
        

    }
}
