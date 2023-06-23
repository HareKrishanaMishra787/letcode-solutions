public class Solution {
    public int minFlips(int a, int b, int c) {
        int ans = 0;
        while (a != 0 || b != 0 || c != 0) {
            int x1 = a & 1;
            int x2 = b & 1;
            int x3 = c & 1;
            ans += calculateFlips(x1, x2, x3);
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return ans;
    }
    
    private int calculateFlips(int x1, int x2, int x3) {
        if ((x1 | x2) != x3) {
            if ((x1 & x2) == 1)
                return 2;
            else
                return 1;
        }
        return 0;
    }
}
