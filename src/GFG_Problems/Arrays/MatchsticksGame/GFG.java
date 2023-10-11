package GFG_Problems.Arrays.MatchsticksGame;

class GFG {
    static int matchGame(int N) {
        long newN = 0;
        int i = 1;
        if (N % 5 == 0)
            return -1;
        else {
            while (i <= 4){
                newN = (N - i);
                if (newN % 5 == 0)
                    break;
                i++;
            }
        }
        return i;
        // code here
    }

    public static void main(String args[]) {
        int N = 48;
        System.out.println(matchGame(N));
    }
}
