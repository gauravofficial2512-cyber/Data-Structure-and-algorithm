import java.util.*;
public class pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  =1;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=1;j<=n-k;j++){
                    System.out.print("* ");
                }
                System.out.println();
                k++;
            }
        }
    }
}
