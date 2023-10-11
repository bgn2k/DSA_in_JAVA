package Arrays.EquilibriumPt;

public class Tester {
    static public boolean isEquilibrium(int arr[]) {
        int rs = 0, ls = 0;//initialize rs and ls

        for (int i = 0; i < arr.length; i++) {
            rs+= arr[i];    //find rs
        }
        for (int i = 0; i < arr.length; i++) {
            rs -= arr[i];//update rs
            if(rs == ls)//check for eq
                return true;
            ls += arr[i];//upadte ls
        }
        return false;
    }
    public static void main(String[] args) {
        // int arr[] = {4,8,12,5};
        int arr[] = {3,4,8,-9,9,7};
        System.out.println(isEquilibrium(arr));
    }
}
