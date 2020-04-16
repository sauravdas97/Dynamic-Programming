// find the total number of ways to reach the n th stair using step 1. 2 or 3
class main 
{
    public static void main(String[] args) {
        int n = 4; // n th stair
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        for(int i = 3; i<=n; i++)
        {
            a[i] = a[i-1]+a[i-2]+a[i-3];
        }
        System.out.println(a[n]);
    }
}