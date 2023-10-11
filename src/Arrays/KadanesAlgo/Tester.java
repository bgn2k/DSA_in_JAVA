package Arrays.KadanesAlgo;

public class Tester {
    static public void maxSumSubArray(int arr[]) {
        int res = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            res = Math.max(currSum, res);
        }
        System.out.println("Max Sum of SumArray: " + res);
    }
    public static void main(String[] args) {
        int arr[] = {3,-4,5,6,-8,7};
        maxSumSubArray(arr);
    }
}

   