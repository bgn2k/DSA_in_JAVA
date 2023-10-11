package GFG_Problems.Arrays.MeanNMedian;
//{ Driver Code Starts

//Initial Template for Java

/*package whatever //do not write package name here */
import java.util.*;

// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find median of the array elements.
    public static int median(int A[], int N) {

        Arrays.sort(A);
        if (N % 2 != 0) {
            int mid = A[N / 2];
            return mid;
        } else {
            int midBefore = A[(N - 1) / 2];
            int mid = A[N / 2];
            int median = (midBefore + mid) / 2;
            return median;
        }
    }

    // Function to find median of the array elements.
    public static int mean(int A[], int N) {
        int mean = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        mean = sum / N;
        return mean;
        // Your code here
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 19, 28, 5 };
        int n = a.length;
        System.out.println(mean(a, n));
        System.out.println(median(a, n));
    }

}
