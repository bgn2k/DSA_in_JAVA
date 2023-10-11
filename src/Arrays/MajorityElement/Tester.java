package Arrays.MajorityElement;

public class Tester {
    static public int majorityElement(int arr[]) {
        int res = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[res])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == arr[res])
                count++;
        }
        if (count <= arr.length / 2)
            return -1;

        return arr[res];

    }

    public static void main(String[] args) {
        // int arr[] = { 3, -4, 5, 6, -8, 7 };
        int arr[] = { 8, 8, 6, 6, 6, 4, 6 };

        System.out.println(majorityElement(arr));
    }
}
