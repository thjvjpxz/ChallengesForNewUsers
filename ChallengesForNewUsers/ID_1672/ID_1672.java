public class ID_1672 {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                if (j == accounts[i].length - 1 && i == 0) res = sum;
            }
            if (sum > res)  res = sum;
        }
        return res;
    }
}
