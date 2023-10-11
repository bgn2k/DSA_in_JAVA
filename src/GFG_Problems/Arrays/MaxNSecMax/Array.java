package GFG_Problems.Arrays.MaxNSecMax;

import java.util.*;

class Array {
    public static ArrayList<Integer> largestAndSecondLargest(int n, int arr[]) {
        ArrayList<Integer> newRes = new ArrayList<Integer>();

        int max = 0;
        int secMax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        if (secMax == 0) {

            newRes.add(max);
            newRes.add(-1);
        } else {
            newRes.add(max);
            newRes.add(secMax);
        }
        return newRes;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 2 };
        int n = arr.length;
        System.out.println(largestAndSecondLargest(n, arr));
    }

}
