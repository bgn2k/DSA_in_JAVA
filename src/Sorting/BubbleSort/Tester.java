package Sorting.BubbleSort;

//Demo of Bubble Sort.
public class Tester {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("\nSorted Array Using Bubble Sort: ");
        doBubbleSort(arr);
        System.out.println("\n");
    }

    private static void doBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    // Earlier i was getting an exception of ArrayOutOfBounds for this line
                    // Where i have written the arr[j] and arr[j+1] in the func which was wrong
                    // cause you
                    // should have written the index instead of the element itself.
                    isSwapped = true;
                }
            }
            if (isSwapped == false)
                break;
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
