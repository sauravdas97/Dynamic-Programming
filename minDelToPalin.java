// count the number of deletion that has to be made to make the stirng palindrome
// in the string abefbac 2 elements are to be deleted i.e. f,c
class main {
    public static void main(String[] args) {
        String s = "abefbac";
        int n = s.length();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            a[i][i] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                int k = j + i;
                if (s.charAt(j) == s.charAt(k) && i == 1)
                    a[j][k] = 2;
                else if (s.charAt(j) == s.charAt(k))
                    a[j][k] = 2 + a[j + 1][k - 1];
                else
                    a[j][k] = Math.max(a[j + 1][k], a[j][k - 1]);
            }
        }
        System.out.println(n - a[0][n - 1]);
    }
}