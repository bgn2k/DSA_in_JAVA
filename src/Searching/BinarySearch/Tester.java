package Searching.BinarySearch;

public class Tester {
    static public int bSearch(int arr[],int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int x = 22;
        System.out.println("The given element is at index: " + bSearch(arr, x));
    }
}
