package Sorting.IntersectionOf2SortedArrays;

public class Tester {
    public static void main(String[] args) {
        // int a[]= {1, 20, 20, 40, 60};
        // int b[] = {2, 20, 20, 20};
        // int a[] = {1, 2, 3, 4} ;
        // int b[] = {2, 4, 6, 7, 8};
        int[] arr1 = { 1, 3, 3, 5, 7, 8 };
        // for (int i = 1; i < arr1.length; i++) {
        // if(arr1[i] == arr1[i-1]){
        // arr1[i] = arr1[i+1];
        // }
        // }
        int[] arr2 = { 2, 3, 4, 5, 6 };
        getIntersection(arr1, arr2);
    }

    // NAIVE APPROACH...
    // private static void getCommon(int[] arr1, int[] arr2) {
    //     int i = 0;
    //     int j = 0;
    //     int k = 0;
    //     int n = arr1.length;
    //     int m = arr2.length;
    //     // int arr[] = new int[Math.min(n,m)];
    //     for (int l = 0; l < n; l++) {
    //         if (l > 0 && (arr1[l] == arr1[l - 1]))
    //             continue;
    //         for (int l2 = 0; l2 < m; l2++) {
    //             if (arr1[l] == arr2[l2]) {
    //                 System.out.println(arr1[l]);
    //                 break;
    //             }
    //         }
    //     }

    // }

    // Efficient Method
    private static void getIntersection(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while ((i < n) && (j < m)) {
            if (i > 0 && arr1[i] == arr1[i - 1])
                continue;
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }

        }
    }
}
