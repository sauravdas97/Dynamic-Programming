// find that if there exist subset in an array whose sum results in the given sum
// {1,2,3,5}; k = 7; so here 5+2 = 7 so there exist a subset

class main 
{
    public static void main(String[] args) {
        int[] ar = {1,2,3,8};
        int sum = 7;
        int[][] a = new int[ar.length][sum+1];
        for (int i = 0; i < ar.length; i++)
            a[i][0] = 1;

        a[0][1] = 1;

        for (int i = 1; i < a.length; i++)
        {
            for (int j = 1; j <= sum; j++) 
            {
                if(a[i][j-1] == 1)
                {
                    a[i][j] = 1;
                }
                else 
                {
                    if(ar[i] == j)
                        a[i][j] = 1;
                    else
                        a[i][j] = a[i-1][j-ar[i]];
                }
            }
        }
        System.out.println(a[ar.length-1][sum]);
    }
}
