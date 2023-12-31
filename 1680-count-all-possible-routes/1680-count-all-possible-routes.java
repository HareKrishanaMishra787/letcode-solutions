class Solution {
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int MOD = 1000000007;
        int n = locations.length;
        int[][] dp = new int[n][fuel + 1];

        // Base case: if start and finish are the same, it's a valid route
        dp[start][fuel] = 1;

        for (int remainingFuel = fuel; remainingFuel >= 0; remainingFuel--) {
            for (int currCity = 0; currCity < n; currCity++) {
                for (int nextCity = 0; nextCity < n; nextCity++) {
                    if (currCity != nextCity && remainingFuel >= Math.abs(locations[currCity] - locations[nextCity])) {
                        dp[nextCity][remainingFuel - Math.abs(locations[currCity] - locations[nextCity])] = (dp[nextCity][remainingFuel - Math.abs(locations[currCity] - locations[nextCity])] + dp[currCity][remainingFuel]) % MOD;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i <= fuel; i++) {
            count = (count + dp[finish][i]) % MOD;
        }
        return count;
    }
}
