package Sorting.CountInversion;

public class Tester {
    public static void main(String[] args) {
        // int arr[] = {40,30,20,10};
        int arr[] = {10,20,30,40};
        int l = 0, r = arr.length -1;
        System.out.println(getCountInversions(arr, l, r));
    }

    private static int getCountInversions(int[] arr, int l, int r) {
        int res = 0;
        int mid = (l + r) /2 ;
        if(l < r){
            res += getCountInversions(arr, l, mid);
            res += getCountInversions(arr, mid+1, r);
            res += countAndMerge(arr, l , mid, r);
        }
        return res;
    }

    private static int countAndMerge(int[] arr, int l, int mid, int r) {
        int m = r - mid;
        int n = mid - l + 1;
        int left[] = new int[n];
        int right[] = new int[m];
        for (int i = 0; i < n; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid+1+i];
        }
        int res =0,i=0,j=0,k=l;
        while(i<n && j < m){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++; k++;
            }
            else{
                arr[k] = right[j];
                j++; k++;
                res = res + (n - i);
            }
        }
        while(i<n){
            arr[k] = left[i];
            k++;i++;
        }
        while(j < m){
            arr[k] = right[j];
            j++;k++;
        }


        return res;
    }
}