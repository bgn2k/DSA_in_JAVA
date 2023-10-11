package Searching.MedianOf2SortedArrays;

public class Tester {
    public static void main(String[] args) {
        int arr1[] = { -5, 3, 6, 12, 15 };
        int arr2[] = { -12, -10, -6, -3, 4, 10};
        System.out.println("The median of the 2 sorted arrays is: " + getMedian(arr1, arr2));
    }

    private static int getMedian(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1+n2;
        if(n1 > n2)
            return getMedian(arr2, arr1);
        int low = 0;
        int high = n1;
        int left = (n + 1)/2;
        while(low <= high){
            int mid1 = low + high /2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2<n2) r2 = arr2[mid2];
            if(mid1-1>=0) l1 = arr1[mid1-1];
            if(mid2-1>=0) l2 = arr2[mid2 - 1];

            if(l1<=r2 && l2 <= r1){
                if(n%2 !=0)
                    return Math.max(l1, l2);
                return Math.max(l1, l2) + Math.min(r1, r2) / 2;
            }
            else if(l1 >= r2)
                high = mid1 - 1;
            low = mid1 + 1;
        }
        return -1;
    }
}
