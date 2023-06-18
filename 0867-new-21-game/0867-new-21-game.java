class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0) {
            return 1.0;
        }

        double wsum = 0;
        for (int i = k; i < k + maxPts; i++) {
            wsum += (i <= n) ? 1 : 0;
        }

        Map<Integer, Double> dp = new HashMap<>();
        for (int i = k - 1; i >= 0; i--) {
            dp.put(i, wsum / maxPts);
            double rem = 0;
            if (i + maxPts <= n) {
                rem = dp.getOrDefault(i + maxPts, 1.0);
            }

            wsum += (dp.get(i) - rem);
        }

        return dp.get(0);
    }
}