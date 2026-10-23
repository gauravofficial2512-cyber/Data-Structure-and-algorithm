import java.util.*;
public class pattern16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char a = 'A';
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
            }
            a++;
            System.out.println();
        }
    }
}
