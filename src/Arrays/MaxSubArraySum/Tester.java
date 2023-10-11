package Arrays.MaxSubArraySum;

public class Tester {
    static  public void maxSubArray(int arr[]) {
        //This is called as the KADANE'S AlGO
        
        int res = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(maxEnd+arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[] ={2,3,-8,7,-1,2,3};
        System.out.println("Output" );
        maxSubArray(arr);
    }
}
