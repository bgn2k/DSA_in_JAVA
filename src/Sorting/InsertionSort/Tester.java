package Sorting.InsertionSort;

class InsertioSort {
    public static void doInsertioSort(int[] arr) {//This is not the implementation of the Insertion sort
        // // int curr = 0;
        // int temp = 0;
        // // {20,5,40,60,10,30};
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         temp = arr[j];
        //         if (temp < arr[i]) {
        //             arr[j] = arr[i];
        //             arr[i] = temp;

        //         }
        //     }
        // }
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        // for (int i = 1; i < arr.length; i++) {
        //     int temp = arr[i];
        //     int j = i -1;
        //     while(temp > arr[j] && j >= 0){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = temp;
        // }

        int i, key, j;
        for(i =1; i< arr.length; i++){
            key = arr[i];
            j = i -1;
            while(j>= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }

}

public class Tester {
    public static void main(String[] args) {
        int arr[] = { 20, 5, 40, 60, 10, 30 };
        // Test Case 1: Basic Test Case
        int[] arr1 = { 5, 2, 9, 3, 4 };
        // After sorting: {2, 3, 4, 5, 9}

        // Test Case 2: Sorted Array (Best Case)
        int[] arr2 = { 1, 2, 3, 4, 5 };
        // After sorting: {1, 2, 3, 4, 5}

        // Test Case 3: Reverse Sorted Array (Worst Case)
        int[] arr3 = { 5, 4, 3, 2, 1 };
        // After sorting: {1, 2, 3, 4, 5}

        // Test Case 4: Array with Duplicate Values
        int[] arr4 = { 5, 2, 9, 3, 2 };
        // After sorting: {2, 2, 3, 5, 9}

        // Test Case 5: Empty Array
        int[] arr5 = {};
        // After sorting: {}

        // Test Case 6: Array with a Single Element
        int[] arr6 = { 1 };
        // After sorting: {1}

        // Test Case 7: Large Random Array
        int[] arr7 = { 12, 45, 1, 78, 90, 4, 56, 89, 34, 23 };
        // After sorting: {1, 4, 12, 23, 34, 45, 56, 78, 89, 90}

        System.out.println("Sorted Array Using Insertion Sort: ");
        InsertioSort.doInsertioSort(arr);
        System.out.println("\n");
        InsertioSort.doInsertioSort(arr1);
        System.out.println("\n");

        InsertioSort.doInsertioSort(arr2);
        System.out.println("\n");
        InsertioSort.doInsertioSort(arr3);
        System.out.println("\n");
        InsertioSort.doInsertioSort(arr4);
        System.out.println("\n");
        InsertioSort.doInsertioSort(arr5);
        System.out.println("\n");
        InsertioSort.doInsertioSort(arr6);
        System.out.println("\n");
        InsertioSort.doInsertioSort(arr7);

    }

}
