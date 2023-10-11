package Arrays.EvenOddSubarray;

public class Tester {
    static public void longestEveOddSubarray(int arr[]) {
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            // for (int j = 0; j < arr.length; j++) {
                // If the first element is even then the second element must be odd...
                if (arr[i] % 2 == 0) { 
                    if (arr[i + 1] % 2 != 0) {//    check is odd?
                        count++;    //if odd then ++
                    }
                }
                else if(arr[i] % 2 != 0){
                    if(arr[i+1] % 2 == 0){
                        count++;
                    }
                }
            // }
        }
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // int arr[] = {
        //         10, 12, 14, 7, 8
        // };
        // int arr[] = {7,10,13,14};
        // int arr[] = {10,12,8,4};
        int[] arr = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };// For this array the code is not working!!!
        longestEveOddSubarray(arr);
    }
}
