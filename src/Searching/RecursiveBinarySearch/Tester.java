package Searching.RecursiveBinarySearch;

public class Tester {
    static public int bSearch(int arr[], int low, int high, int x) {
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid] < x){
            return bSearch(arr, mid +1, high, x);
        }
        else
            return bSearch(arr, low, mid - 1, x);
        // return -1;
    }
    public static void main(String[] args) {
            int arr[] = {10,20,30,40,50,60,70};
            int x = 50;
            int low = 0; int high = arr.length - 1;
            System.out.println("The given element is at index: " + bSearch(arr,low, high, x));
    }
    
}
