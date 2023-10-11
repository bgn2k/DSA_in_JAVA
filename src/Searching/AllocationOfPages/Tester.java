package Searching.AllocationOfPages;

public class Tester {

    public static void main(String[] args) {
        // A[] = {12,34,67,90}
        // M = 2
        int arr[] = { 12, 34, 67, 90 };
        int k = 2;
        System.out
                .println("The minimum of total no of pages to be read by " + k + " students is: " + getAnswer(arr, k));
    }

    // Main func to find the Max of min no of pages.
    private static int getAnswer(int[] arr, int k) {
        if (k > arr.length)// if the no of students give is greater than the length of the array then
                           // return -1.
            return -1;
        int sum = 0;
        int max = 0;
        // Loop to find the max and the total sum of the array.
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max, high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            // value of students get stored in the noOfStudents var and then we check
            int noOfStudents = getStudents(arr, k, mid);
            if (noOfStudents > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    // Func to get the amount of students required to constitue to the give maxPages
    // that is the mid variable.
    private static int getStudents(int arr[], int k, int maxPages) {
        int students = 1; // =1 cuz atleast one student must be given the book to read or should read a
                          // book.
        int sum = 0;
        // {12,34,67,90}; maxPages = mid = 90 + 203 / 2 = 146
        for (int i = 0; i < arr.length; i++) {// 23
            if (sum + arr[i] <= maxPages) {
                sum += arr[i]; // 12,46,113,

            } else {
                students++;// 2
                sum = arr[i];// 90
            }

        }
        return students;
    }
}
