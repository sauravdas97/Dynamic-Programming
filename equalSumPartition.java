// check if the array has 2 partitions having equal sum
// {1,2,3,5,7} and here 7+2 = 5+3+1 so {7,2} and {5,3,1} are the 2 partition having same sum
class main 
{
    public static void main(String[] args) {
        int[] ar = {1,2,3,5,7};
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        if(sum%2==0)
        {
            int n = sum/2;
            int[][] a = new int[ar.length][n+1];
            for (int i = 0; i < a.length; i++)
                a[i][0] = 1;
            a[0][1] = 1;
            for (int i = 1; i < a.length; i++) {
                for (int j = 1; j <= n; j++) {
                    if(a[i-1][j] == 1)
                        a[i][j] = 1;
                    else{
                        a[i][j] = a[i-1][j-ar[i]];
                    }
                }
            }
            String res = (a[ar.length-1][n] == 1)?"Yes":"No";
            System.out.println(res);
        }
        else
        {
            System.out.println("not possible");
        }
    }
}