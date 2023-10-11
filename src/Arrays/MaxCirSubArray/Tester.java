package Arrays.MaxCirSubArray;

public class Tester {
    static public int normalSum(int arr[]) {
        int res = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            res = Math.max(currSum, res);
        }    
        return res;
    }
    static public int maxCirSubArray(int arr[]) {
        int maxNormal = normalSum(arr);
        if(maxNormal < 0)
            return 0;
        int totalArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalArraySum += arr[i];
            arr[i] = -arr[i];
        }
        int minSum = normalSum(arr);
        int cirSum = totalArraySum + minSum;

        return Math.max(maxNormal, cirSum);
    }
    public static void main(String[] args) {
        int arr[] = {3,-4,5,6,-8,7};
        System.out.println("Max Sum of Circular Array: " + maxCirSubArray(arr));
    }
}
