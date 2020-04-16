class main
{
    public static void main(String[] args) {
        int[] piece = {1,2,3,4,5};
        int[] profit = {3,5,10,11,15};
        int len = 5;
        int[][] a = new int[profit.length][len+1];
        // for (int i = 0; i < profit.length; i++)
        //     a[i][0] = 0;

        // for (int i = 1; i <=len; i++)
        //     a[0][i] = profit[0]*i;
        for (int i = 0; i < piece.length; i++) {
            for (int j = 1; j <=len; j++) {
                if(piece[i]>j)
                    a[i][j] = a[i-1][j];
                else
                    a[i][j] = Math.max(a[i-1][j], (profit[i]+a[i][j-piece[i]]));
            }
        }
        System.out.println(a[profit.length-1][len]);
    }
}