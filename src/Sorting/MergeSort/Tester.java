package Sorting.MergeSort;

import java.util.Arrays;

public class Tester {
    public static void mergeSort(int arr[], int l, int r){
        
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            mergeFunc(arr, l, mid, r);
        }

    }
    public static void mergeFunc(int arr[], int l, int mid, int r){
        int n = mid - l + 1;
        int m = r - mid;

        int arr1[] = new int[n];
        int arr2[] = new int[m];
        //Seperating the arr into arr1 n arr2
        for (int i = 0; i < n; ++i) {
            arr1[i] = arr[l+i];
        }
        for (int i = 0; i < m; ++i) {
            arr2[i] = arr[mid + 1 + i];
        }

        Arrays.sort(arr1); Arrays.sort(arr2); //Sorting the obtained arrays using the .sort()

        int i = 0, j = 0;
        int k = l;
        while((i < n) && (j < m)){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;k++;
            }
            else{
                arr[k] = arr2[j];
                j++; k++;
            }
        }
        while(i<n){
            arr[k] = arr1[i];
            i++;k++;
        }
        while(j<m){
            arr[k] = arr2[j];
            j++; k++;
        }


    }
    public static void main(String[] args) {
        int l = 0;
        System.out.println("Original Array: ");
        // int arr1[] = { 38, 27, 43, 3, 9, 82, 10 };
        int arr1[] ={ 15, 27, 12, 8, 4, 33, 19, 6, 21, 14 };
        for (int i : arr1) {
            System.out.println(i);
        }
        int r = arr1.length -1;
        mergeSort(arr1, l, r);
        // System.out.println(arr1);
        System.out.println("Sorted Array: ");
        for (int i : arr1) {
            System.out.println(i);
        }
        // int arr2[] = { 15, 27, 12, 8, 4, 33, 19, 6, 21, 14 };
        // int arr3[] = { 45, 33, 28, 17, 9, 56, 22, 37, 41, 12 };
        // int arr4[] = { 10, 6, 14, 9, 3, 25, 8, 17, 7, 19 };
        // int arr5[] = { 38, 42, 13, 30, 24, 11, 35, 29, 16, 20 };
        // int arr6[] = { 50, 36, 44, 21, 48, 32, 23, 18, 47, 26 };
        // int arr7[] = { 2, 7, 5, 8, 1, 4, 6, 3, 10, 9 };
        // int arr8[] = { 28, 35, 42, 16, 19, 13, 31, 24, 27, 22 };
        // int arr9[] = { 37, 20, 14, 31, 45, 26, 9, 19, 35, 22 };
        // int arr10[] = { 11, 8, 7, 9, 13, 15, 6, 4, 10, 12 };

    }
}
