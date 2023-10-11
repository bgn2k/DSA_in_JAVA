package Arrays.SlidingWindow;

public class Tester {
    static public int slidingWin(int arr[], int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr + arr[i]- arr[i-k];
            res = Math.max(res, curr);
        }
        return res;
    }
    public static void main(String[] args) {
        //int arr[] = {3,-4,5,6,-8,7};
        int arr[] = {1,8,30,-5,20,7};
        int k = 4;
        System.out.println(slidingWin(arr,k));
    }
}
