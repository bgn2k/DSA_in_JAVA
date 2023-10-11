package Arrays.PrefixSumProb.WeightedPrefixSum;

public class Tester {
    static public int getSum(int l, int r) {
        int arr[] ={2,3,-8,7,-1,2,3};
        int narr[] = new int[arr.length];
        int count = 1;
        for (int i = 0; i < narr.length; i++) {
            narr[i] = count*arr[i];
            count++;//2
            System.out.println(narr[i]);
        }

        System.out.println("After adding");
        // narr[0] = arr[0];
        int[] modArr = new int[arr.length];
        modArr[0] = narr[0];
        System.out.println(modArr[0]);
        for (int i = 1; i < arr.length; i++) {
            modArr[i] = modArr[i-1] + narr[i];
            System.out.println(modArr[i]);
        }    
        System.out.println();
        if(l == 0){
            return modArr[r];
        }
        else{
            return modArr[l-1] - modArr[r];
        }


        // return 0;
    }
    public static void main(String[] args) {
        //int arr[] ={2,3,-8,7,-1,2,3};
        System.out.println(getSum(0,2));
    }
}
