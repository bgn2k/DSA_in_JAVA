package Arrays.PrefixSumProb;

public class Tester {
    static public int getSum(int l, int r) {
        int arr[] ={2,3,-8,7,-1,2,3};
        int narr[] = new int[arr.length];
        narr[0] = arr[0];
        for (int i = 1; i < narr.length; i++) {
            narr[i] = narr[i-1] + arr[i];
            System.out.println(narr[i]);
        }    
        System.out.println();
        if(l == 0){
            return narr[r];
        }
        else{
            return narr[l-1] - narr[r];
        }


        // return 0;
    }
    public static void main(String[] args) {
        //int arr[] ={2,3,-8,7,-1,2,3};
        System.out.println(getSum(0,2));
    }
}
