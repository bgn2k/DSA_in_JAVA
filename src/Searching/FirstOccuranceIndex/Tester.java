package Searching.FirstOccuranceIndex;

public class Tester {
    static public int firstOccuranceIndex(int arr[], int low, int high, int x) {
        while(low <= high){
            int mid = (low + high)/2;
            if(x < arr[mid]){
                high = mid -1;
            }
            else if(x > arr[mid]){
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                } 
                else    
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[ ] = {5,10,10,20,20};
        int low = 0, high = arr.length - 1;
        int x = 20;
        System.out.println("The first occurance of the element " + x + " is at index: " + firstOccuranceIndex(arr,low,high,x));
    }
}
