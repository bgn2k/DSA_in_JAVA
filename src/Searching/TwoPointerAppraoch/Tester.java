package Searching.TwoPointerAppraoch;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {
            2,5,8,12,30
        };
        int x = 17;
        System.out.println("Whether the element pair is present in the array? ");
        System.out.println(getStatus(arr,x));
    }

    private static boolean getStatus(int[] arr, int x) {
        // String ans = "";
        int i = 0; int j = arr.length -1;
        while(i<j){
            if((arr[i] + arr[j]) == x){
                return true;
            }
            else if(arr[i] + arr[j] > x){
                j--;
            }
            else
                i++;
        }
        return false;
        
    }


}
