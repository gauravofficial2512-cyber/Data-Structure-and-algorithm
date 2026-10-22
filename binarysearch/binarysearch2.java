/**
 * binarysearch2
 */
public class binarysearch2 {

    public static String search(int l,int h,int[] arr,int t){
        if(l>h) return "not found";
        int mid = (l+h)/2;
        if(arr[mid]==t){
            return "found";
        }
        if(arr[mid]<t){
            return search(mid+1, h, arr, t);
        }else{
            return search(l, mid-1, arr, t);
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,11,12,34};
        System.out.println(search(0, arr.length-1, arr, 75));
    }
}