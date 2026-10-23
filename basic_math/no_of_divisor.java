import java.util.*;
public class no_of_divisor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                l.add(i);
            }
        }
        for(int i : l){
            System.out.print(i+" ");
        }
    }
}
