// Find maximum sum of array elements if consecutive elements are not allowed
// {4,2,3,5,1,6,7} - so here 4,5,7 are the 3 elements to be added
class main
{
    public static void main(String[] args) {
        int[] ar = {4,2,3,5,1,6,7};
        int[] dp = new int[ar.length];
        dp[0] = ar[0];
        dp[1] = Math.max(ar[0],ar[1]);
        for(int i = 2; i<ar.length; i++)
            dp[i] = Math.max(dp[i-1], ar[i]+dp[i-2]);
        System.out.println(dp[ar.length-1]);
    }
}