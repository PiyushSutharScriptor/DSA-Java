public class CherryPickUp2Tabulation {

    public static int findMax(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][][] dp = new int[m][n][n];

        for (int j1 = 0; j1 < n; j1++) {
            for (int j2 = 0; j2 < n; j2++) {
                if (j1 == j2) dp[m - 1][j1][j2] = arr[m - 1][j1];
                else dp[m - 1][j1][j2] = arr[m - 1][j1] + arr[m - 1][j2];
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < n; j1++) {
                for (int j2 = 0; j2 < n; j2++) {

                    int maxi = (int) -1e8;

                    for (int dj1 = -1; dj1 <= 1; dj1++) {
                        for (int dj2 = -1; dj2 <= 1; dj2++) {
                            int value = 0;

                            if (j1 == j2) value = arr[i][j1];
                            else value = arr[i][j1] + arr[i][j2];

                            int nextJ1 = j1 + dj1;
                            int nextJ2 = j2 + dj2;

                            if (nextJ1 >= 0 && nextJ1 < n && nextJ2 >= 0 && nextJ2 < n)
                                value += dp[i + 1][nextJ1][nextJ2];
                            else
                                value += (int) -1e8;

                            maxi = Math.max(maxi, value);
                        }
                    }

                    dp[i][j1][j2] = maxi;
                }
            }
        }

        return dp[0][0][n - 1];
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 1, 2},
            {3, 4, 2, 2},
            {5, 6, 3, 5}
        };

        int res = findMax(arr);
        System.out.println(res);
    }
}
