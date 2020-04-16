class main
{
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int k = 7;
        int[][] a = new int[coins.length][k+1];

        for(int i = 0; i < coins.length; i++)
            a[i][0] = 0;
        
        for(int i = 1; i <=k; i++)
            a[0][i] = i;
        
        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j <= k; j++) {
                if(j<coins[i])
                    a[i][j] = a[i-1][j];
                else if(coins[i]<=j)
                    a[i][j] = Math.min(a[i-1][j], 1+a[i][j-coins[i]]);
            }
        }
        System.out.println(a[coins.length-1][k]);
    }
}