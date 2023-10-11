package Sorting.UnionOf2SortedArr;

public class Tester {
    public static void main(String[] args) {
        // int a[] = { 2, 10, 20, 20 };
        // int b[] = { 3, 20, 40 };
        int a[] = new int[] { 3, 8, 8 };
        int b[] = new int[] { 2, 8, 8, 10, 15 };
        // int n = a.length;
        // int m = b.length;

        getUnion(a, b);
    }

    // private static void getUnion(int[] a, int[] b, int n, int m) {
    // int i = 0, j = 0;
    // while ((i < n) && (j < m)) {
    // if ((i > 0) && (a[i] == a[i - 1])) {
    // i++;
    // continue;

    // }
    // if ((j > 0) && (b[j] == b[j - 1])) {
    // j++;
    // continue;
    // }
    // if (a[i] < b[j]) {
    // System.out.println(a[i]);
    // i++;
    // } else if (a[i] > b[j]) {
    // System.out.println(b[j]);
    // j++;
    // } else {
    // System.out.println(a[i]);
    // i++;
    // j++;
    // }
    // }
    // while (i < n) {
    // if (i > 0 && a[i] != a[i - 1]) {
    // System.out.println(a[i]);
    // i++;
    // }
    // }
    // while (j < m) {
    // if ((j > 0) && (b[j] != b[j - 1])) {
    // System.out.println(b[j]);
    // j++;
    // }
    // }
    // }

    public static void getUnion(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                System.out.println(b[j]);
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.println(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                System.out.println(b[j]);
            }
            j++;
        }
    }
}
