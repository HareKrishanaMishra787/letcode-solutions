public class Solution {
    public int divide(int a, int b) {
        int sign = determineSign(a, b);
        long x = Math.abs((long) a);
        long y = Math.abs((long) b);
        long tot = 0;
        while (x >= y) {
            int cnt = calculateShiftCount(x, y);
            tot += 1L << cnt;
            x -= y << cnt;
        }
        long ans = sign * tot;
        if (ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE) {
            return (int) ans;
        }
        return Integer.MAX_VALUE;
    }

    private int determineSign(int a, int b) {
        if ((a < 0) != (b < 0)) {
            return -1;
        }
        return 1;
    }

    private int calculateShiftCount(long x, long y) {
        int cnt = 0;
        while (x >= (y << (cnt + 1))) {
            cnt++;
        }
        return cnt;
    }
}
