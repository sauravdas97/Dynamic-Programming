
// Count of subset with sum equal to given sum
// given an array find the total number of subset whose sum is equal to the given value
// { 2, 3, 7, 1, 4, 5 }, and sum = 7. So here (2,5), (7), (3,4), (4,2,1) are the 4 subsets whose sum is 7
class main {
    public static void main(String[] args) {
        int[] ar = { 2, 3, 7, 1, 4, 5 };
        int s = 7;
        int[][] a = new int[ar.length][s + 1];

        for (int i = 0; i < ar.length; i++)
            a[i][0] = 1;

        for (int j = 0; j <= s; j++)
            if (ar[0] == j)
                a[0][j] = 1;
        for (int i = 1; i < ar.length; i++) {
            for (int j = 1; j <= s; j++) {
                if (ar[i] <= j)
                    a[i][j] = a[i - 1][j] + a[i - 1][j - ar[i]];
                else
                    a[i][j] = a[i - 1][j];
            }
        }
        System.out.println(a[ar.length - 1][s]);
    }
}