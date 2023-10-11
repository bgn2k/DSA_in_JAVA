package Sorting.Comparators;
//DEMO OF COMPARATORS!!!
import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // Integer nArr[] = { 5, 20,10, 3, 12 };
        Integer nArr[] = {10,5,20};
        for (int nums : nArr) {
            arr.add(nums);
        }
        System.out.println("\nOriginal ArrayList: " + arr);

        // Comparator<Integer> arrLogic = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if((i%2 == 0)&&(j%2 != 0))
        //             return -1;
        //         else    
        //             return 1;
        //     }

        // };
        Collections.sort(arr);
        System.out.println("\nAsec Sorted Array: " + arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("\nReversed ArrayList: " + arr + "\n");
        // Collections.sort(arr, arrLogic);
        // System.out.println(arr);

    }
}
