/**
 * binarysearch1
 */
public class binarysearch1 
{
        public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,9,12};
        int t = 66;
        int l = 0;
        int r = arr.length -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==t){
                System.out.print("found");
                return;
            }else if(t>arr[mid]){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.print("not found");
    }
    
}
