import java.util.*;
public class pattern12 {
    public static void main(String args[]){
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2*n-2;
        System.out.println(s);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=s-k;j++){
                System.out.print("  ");
            }
            k=k+2;
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
