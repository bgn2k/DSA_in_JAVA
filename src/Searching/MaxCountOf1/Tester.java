package Searching.MaxCountOf1;

public class Tester {
    static public int maxCountOf1(int arr[]){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if( 0 == arr[mid]){//chechking if the mid element is 0
                // high = mid - 1; //if zero then move the high to mid -1 
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid -1] == 0) //x is in the first element or the previous element is 0
                    return arr.length - mid; //Return that index
                else
                    high = mid -1;//this means that the found 1 is not the fist occurence so we need to move the 
                    //value of high to mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1,1};
        System.out.println("The max count of " + 1 + " is: " + maxCountOf1(arr));
                    
    }
}
