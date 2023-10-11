package Searching.MaxCountOfX;

public class Tester {
    static public int maxCountOfX(int arr[], int x) {
        int first = first(arr, x);
        if(first == -1)
            return 0;
        else{
            int last = last(arr, x);
            int count = last - first + 1;
            return count;
        }
        

        
    }
    static public int first(int arr[], int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if( x < arr[mid]){
                high = mid - 1;
            }
            else if(x > arr[mid]){
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid] != arr[mid - 1]){
                    return mid;
                }
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    static public int last(int arr[], int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(x < arr[mid]){
                high = mid - 1;
            }
            else if(x > arr[mid]){
                low = mid + 1;
            }
            else{
                if(mid == arr.length -1 || arr[mid] != arr[mid+1]){
                    return mid;
                }
                else    
                    low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {0,0,0,1,1,1,1};
        int arr[] = {5,10,10,10,20,20};
        int x = 10;
        System.out.println("The max count of " + x +" is : " + maxCountOfX(arr, x));
    }
}
