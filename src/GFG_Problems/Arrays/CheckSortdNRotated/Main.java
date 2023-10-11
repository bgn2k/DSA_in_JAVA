package GFG_Problems.Arrays.CheckSortdNRotated;
//WORKING ON THIS NOT YET COMPLETED!!!
class Main {
    // public static int getMinIndex(int nums[]) {

    // // Your code here
    // // { 3, 4, 1, 2 };
    // int min = nums[0];
    // int minIndex = 0;
    // for (int i = 1; i < nums.length; i++) {
    // if (nums[i] < nums[i - 1]) {
    // min = nums[i];
    // minIndex = i;
    // }
    // }
    // // System.out.println("Min: " + min);
    // // System.out.println("Min Index: " + minIndex);

    // return minIndex;
    // // System.out.println(min);

    // }

    // public static boolean getStatus(int[] nums) {
    //     // int min = nums[0];
    //     // int minIndex = 0;
    //     // for (int i = 1; i < nums.length; i++) {
    //     //     if (nums[i] < nums[i - 1]) {
    //     //         min = nums[i];
    //     //         minIndex = i;
    //     //     }
    //     // }
    //     // // int minIndex = getMinIndex(nums);
    //     // // { 3, 4, 1, 2 };
    //     // for (int i = minIndex; i < nums.length - 1;i++) {
    //     //     if ((nums[i + 1] > nums[i] && nums[i - 1] < nums[i])) {
    //     //         return true;
    //     //     } else {
    //     //         return false;
    //     //     }
    //     // }

    //     // return false;
    //     int n = nums.length;
        
    //     // Find the index of the minimum element in the array
    //     int minIndex = findMinIndex(nums);
        
    //     // Check if the array is sorted in either ascending or descending order
    //     boolean isAscending = isSortedAscending(nums);
    //     boolean isDescending = isSortedDescending(nums);
        
    //     // Check conditions for sorted and rotated
    //     return minIndex != 0 && (isAscending || isDescending);
    // }
    
    // // Helper method to find the index of the minimum element
    // private static int findMinIndex(int[] nums) {
    //     int minIndex = 0;
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] < nums[minIndex]) {
    //             minIndex = i;
    //         }
    //     }
    //     return minIndex;
    // }
    
    // // Helper method to check if the array is sorted in ascending order
    // private static boolean isSortedAscending(int[] nums) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] > nums[i + 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    // // Helper method to check if the array is sorted in descending order
    // private static boolean isSortedDescending(int[] nums) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] < nums[i + 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean getStatus(int arr[]){

        int min = arr[0];
        int minIndex = 0;
        // {2,1,3,4};
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                min = arr[i]; // Finding the minimum number in the array. 
                minIndex = i;
            }
        }
        System.out.println("Min Index: " + minIndex);
        boolean isAsec = false;
        boolean isDesc = false;
        for (int i = minIndex; i < arr.length; i++) {
            if(((i != 0) || (i != arr.length - 1))&&(arr[i] < arr[i+1])){
                isAsec = true;
            }
            else if(((i != 0) || (i != arr.length - 1))&&(arr[i] > arr[i+1])){
                isDesc = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int nums[] = { 3, 4, 1, 2 };
        // int nums[] = {10,20,14 };
        int nums[] = {2,1,3,4};
        System.out.println(getStatus(nums));
    }
}
