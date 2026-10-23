import java.util.*;
public class pattern22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2*n-1-2;
        int b = n;
        int k = 0;
        int e = 2;
        int s2 = 1;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                int a = n;
                for(int j=1;j<=i;j++){
                    System.out.print(a+" ");
                    a--;
                }
                if(b>1){
                     for(int j=1;j<=s;j++){
                        System.out.print(b+" ");
                    }
                }
                b--;
                s=s-2;
                int c = n-k;
                if(c==1){
                    c++;
                    for(int j=i-1;j>=1;j--){
                        System.out.print(c+" ");
                        c++;
                    }
                }else{
                    for(int j=i;j>=1;j--){
                        System.out.print(c+" ");
                        c++;
                    }
                }
                k++;
                System.out.println();
            }else{
                int d = n;
                for(int j=1;j<=((2*n-1)-i+1);j++){
                    System.out.print(d+" ");
                    d--;
                }

                int f = e;
                for(int j=1;j<=s2;j++){
                    System.out.print(e+" ");
                }

                for(int j=((2*n-1)-i+1);j>=1;j--){
                    System.out.print(f+" ");
                    f++;
                }
               
                s2=s2+2;
                e++;
                System.out.println();
                
            }
          
        }

    }
}