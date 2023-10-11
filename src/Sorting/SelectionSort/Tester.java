package Sorting.SelectionSort;

//Demo of selection sort...
public class Tester {
    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        System.out.println("\nSorted Array Using Selection Sort: ");
        doSelectionSort(arr);
        System.out.println("\n");
    }

    private static void doSelectionSort(int[] arr) {
        int minIndex = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    minIndex = i;
                }
            }
            swap(arr, minIndex, k);
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
