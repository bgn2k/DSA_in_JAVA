package Searching.BSInRotatedArray;

public class Tester {
    static public int getIndex(int arr[], int x){
        int low= 0, high = arr.length -1 ;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[low] < arr[mid]){//in the video it is written <= but here i have wirtten < i think mine is correct cause if we have element that is not in the array this will impact the code if there is a equal to sign so i think we should not write the = here in that condition. So Beware!
                // high = mid - 1;
                // if(arr[low] == x){
                //     return low;
                // }
                if(x >= arr[low] && x < arr[high]){//We are using the >= cuz we wanna check whether the x is equal to arr[low] or greater than that for starters.
                    high = mid -1;
                }
                else    
                    low = mid + 1;
            }
            else{
                if(x > arr[mid] && x<=arr[high]){
                    low = mid + 1;
                }
                else   
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,40,60,5,8};
        int x = 5;
        System.out.println("The element " + x + " is in index: " + getIndex(arr,x));
    }
}
