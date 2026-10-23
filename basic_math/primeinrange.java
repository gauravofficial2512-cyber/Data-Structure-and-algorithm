import java.util.*;
public class primeinrange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i++){
            int c = 0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    c++;
                    if(i/j != j){
                        c++;
                    }
                }
            }
            if(c==2){
                ans++;
            }
        }
        System.out.print(ans);
    }
}
