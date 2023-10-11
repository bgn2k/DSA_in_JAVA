package Arrays.MaxAppearingInRange;

public class Tester {
    static public int maxApperatingElement(int left[], int right[], int n){
        int freq[] = new int[100];

        for (int i = 0; i < n; i++) {
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int res = 0;
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
            if(freq[i] > freq[res]){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // int left[] = {1,2,4};
        // int right[] = {4,5,7};
        int left[] = { 1, 4, 9, 13, 21 };
	int right[] = { 15, 8, 12, 20, 30 };
        int n = left.length;

        System.out.println(maxApperatingElement(left, right, n));
    }
}
