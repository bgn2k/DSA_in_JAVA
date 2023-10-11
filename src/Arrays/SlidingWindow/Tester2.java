package Arrays.SlidingWindow;

public class Tester2 {
    static public boolean isSumPresent(int arr[], int sum) {

        int left = 0, right = 0, curr = 0;
        for(;right<arr.length;right++){
            curr += arr[right];
            while(curr > sum && left <= right){
                curr -= arr[left];
                left++;
            }
        }
        //If you wanna return the subarrays instead of the boolean value use the below code.

        // if (currentSum == targetSum) {
        //     int[] subarray = new int[right - left + 1];
        //     for (int i = left; i <= right; i++) {
        //         subarray[i - left] = arr[i];
        //     }
        //     return subarray;
        // }
        if(curr == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //int arr[] = {1 ,4,20,3,10,5};
        int arr[] = {4,8,12,5};
        int sum = 17;
        System.out.println("Is "+sum +" present in the given array?\n"+isSumPresent(arr, sum));
    }
}
