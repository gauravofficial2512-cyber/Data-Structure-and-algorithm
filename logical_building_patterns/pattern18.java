import java.util.*;
public class pattern18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            char a = (char)((int)'A' + n-i);
            for(int j=i;j>=1;j--){
                System.out.print(a+" ");
                a++;
            }
            System.out.println("  ");
        }
        

    }
}
