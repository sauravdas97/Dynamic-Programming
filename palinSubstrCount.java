// count all the possible palindromic substring in a given string
class main {
    public static void main(String[] args) {
        String s = "bcacbf";
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++)
            dp[i][i] = 1;
        for (int i = 1; i < n; i++)
            for (int j = 0; i + j < n; i++)
            {
                int k = j + i;
                if(s.charAt(j) == s.charAt(k) && i ==1)
                    dp[j][k] = 1;
                if (s.charAt(j) == s.charAt(k) && s.charAt(j+1) == s.charAt(k-1))
                    dp[j][k] = 1;
            }
        int c = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                c += dp[i][j] == 1 ? 1 : 0;
        System.out.println(c);
    }
}