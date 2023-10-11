package GFG_Problems.Arrays.ReverseSubArrayGroups;
//WORKING ON THIS NOT YET COMPLETED !!!
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();//{1,2,3,4,5};
        // int intArrrr[] = {1,2,3,4,5};
        // arr.addAll(intArrrr);
        List<Integer> newNumbers = Arrays.asList(1, 2, 3, 4, 5);
        arr.addAll(newNumbers);
        int n = arr.size();
        int k = 3;
        reverseInGroups(arr, n, k);
        

    }



    //Function to reverse every sub-array group of size k.
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k){
        // code here
        int temp = 0;
        System.out.println(arr);
        for (int i = 0; i < k-1; i++) {
            temp = arr.get(i);
            arr.add(i,arr.get(k-1));



        }
    }
}


