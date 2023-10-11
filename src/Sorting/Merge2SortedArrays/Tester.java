package Sorting.Merge2SortedArrays;

import java.util.Arrays;

class BruteForceMethod {
    public static void getSortedArray(int arr1[], int arr2[]) {
        int n = arr1.length, m = arr2.length;
        int arr3[] = new int[n + m];
        int left = 0, right = 0, index = 0;
        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            }

            else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }

        }
        while (left < n) {
            arr3[index++] = arr1[left++];
        }
        while (right < m) {
            arr3[index++] = arr2[right++];
        }
        // We have computed the arr3 till here now we need to distribute the elements to
        // the respective arr1 and arr2 depending upon their size.

        for (int i = 0; i < arr3.length; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }
        
        System.out.println("\n");
        for (int i : arr3) {
            System.out.println(i);
        }
        System.out.println("\n");

    }

}
class optimalSoln{
    public static void getOptimalSoln(int arr1[], int arr2[]){
        int left = arr1.length - 1;
        int right = 0;
        while (left >= 0 && right > arr2.length) {
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--;
                right++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("\n");
        for (int i : arr1) {
            System.out.println(i);
        }
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("\n");

    }
}

public class Tester {

    public static void main(String[] args) {
        // Creating obj
        // Test Case 1
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        // Expected output: [1, 2, 3, 4, 5, 6]
        BruteForceMethod.getSortedArray(arr1, arr2);
        optimalSoln.getOptimalSoln(arr1, arr2);
        // Test Case 2
        int[] arr3 = { 1, 3, 5, 7 };
        int[] arr4 = { 2, 4 };
        // Expected output: [1, 2, 3, 4, 5, 7]
        BruteForceMethod.getSortedArray(arr3, arr4);
        optimalSoln.getOptimalSoln(arr3, arr4);
        // Test Case 3
        int[] arr5 = {};
        int[] arr6 = { 2, 4, 6 };
        // Expected output: [2, 4, 6]
        BruteForceMethod.getSortedArray(arr5, arr6);
        optimalSoln.getOptimalSoln(arr5, arr6);
        // Test Case 4
        int[] arr7 = {};
        int[] arr8 = {};
        // Expected output: []
        BruteForceMethod.getSortedArray(arr7, arr8);
        optimalSoln.getOptimalSoln(arr7, arr8);
        // Test Case 5
        int[] arr9 = { 2, 3, 3, 4, 5 };
        int[] arr10 = { 1, 3, 4, 5 };
        // Expected output: [1, 2, 3, 3, 3, 4, 4, 5, 5]
        BruteForceMethod.getSortedArray(arr9, arr10);
        optimalSoln.getOptimalSoln(arr9, arr10);
    }
}
