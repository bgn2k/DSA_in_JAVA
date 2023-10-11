package GFG_Problems.Arrays.RotateArray;

//{ Driver Code Starts
// import java.util.*;
import java.io.*;
// import java.lang.*;

// } Driver Code Ends

class Solution {

    public static void rotateArray(int arr[], int num) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[(i + num) % arr.length] = arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
            System.out.println(arr[i]);
        }

        // Your code here

    }

}

// { Driver Code Starts.

class Main {

    public static void main(String[] args) throws IOException {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int n = arr.length;
        int k = 3;
        // Solution obj = new Solution();
        Solution.rotateArray(arr, k);

    }
}

// } Driver Code Ends