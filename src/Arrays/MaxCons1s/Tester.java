package Arrays.MaxCons1s;

public class Tester {
    static public void max1s(int arr[]) {
        // Eff Soln
        int res = 0, curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(curr, res);
            }
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0 };
        System.out.println("Max 1s: ");
        max1s(arr);
        System.out.println("End");
    }
}
