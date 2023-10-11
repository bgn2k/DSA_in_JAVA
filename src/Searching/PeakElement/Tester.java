package Searching.PeakElement;

public class Tester {
    static public int getPeakElement(int arr[], int n){
        int low = 0; int high = n - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if((mid == 0 ||(arr[mid -1] <= arr[mid]))&&
                (mid == n-1 || (arr[mid+1]<= arr[mid])))
                return mid;
            if(mid >0 && (arr[mid-1] >= arr[mid])){
                high = mid -1;
            }
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,15,5,23,90,67};
        int n = arr.length;
        System.out.println("The Peak Element is: ");
        System.out.println(arr[getPeakElement(arr, n)]);
    }
}
