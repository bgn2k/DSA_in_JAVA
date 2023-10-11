package Searching.ArrayTriplets;

public class Tester {
    private static boolean tripletStatus(int[] arr, int x) {

        for (int i = 0; i < arr.length -2; i++)
            // {2,5,10,15,18}
            //
            if (isPair(arr, x - arr[i], i + 1))
                return true;
        return false;

        // return false;
    }

    private static boolean isPair(int[] arr, int x, int si) {
        int low = si;
        int high = arr.length - 1;
        // int x = x - arr[i];
        while (low < high) {
            if (arr[low] + arr[high] == x) {
                return true;
            }
            if (arr[low] + arr[high] > x)
                high--;
            else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 10, 15, 18 };
        int x = 33;
        System.out.println("Is there a triplet that exist for the sum " + x + ": " + tripletStatus(arr, x));
    }

}
