public class NinjaTraining {
    public static int ninjaTraining(int day, int last, int[][] points, int[][] dp) {
    if (day == 0) {
        int max = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                max = Math.max(max, points[0][task]);
            }
        }
        return max;
    }

    if (dp[day][last] != -1) return dp[day][last];

    int max = 0;
    for (int task = 0; task < 3; task++) {
        if (task != last) {
            int point = points[day][task] + ninjaTraining(day - 1, task, points, dp);
            max = Math.max(max, point);
        }
    }

    return dp[day][last] = max;
}

}
