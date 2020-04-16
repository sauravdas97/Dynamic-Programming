// Coin change problem - find the total number of possible ways by which a number can be formed using the given coins
// {1,2,3}, k = 5 - given coins are 1,2,3 and the no. to form is 5. SO ther are 5 ways by which 5 can be formed

class main 
{
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int k = 5;
        int[][] a = new int[coins.length][k+1];
        for (int i = 0; i < coins.length; i++)
            a[i][0] = 1;

        for (int i = 0; i < k+1; i++)
            a[0][i] = 1;

        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j <= k; j++) {
                if(coins[i]>j)
                    a[i][j] = a[i-1][j];
                else if(coins[i] <= j)
                    a[i][j] = a[i-1][j] + a[i][j-coins[i]];
            }
        }
        System.out.println(a[coins.length-1][k]);
    }
}