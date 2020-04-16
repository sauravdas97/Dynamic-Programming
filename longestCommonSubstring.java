class main 
{
    public static void main(String[] args) {
        String s1 = "abcdegh";
        String s2 = "bdea";
        int[][] a = new int[s1.length()+1][s2.length()+1];
        for(int i = 1; i<=s1.length(); i++)
        {
            for(int j = 1; j<=s2.length(); j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    a[i][j] = 1+a[i-1][j-1];
                else
                    a[i][j] = Math.max(a[i-1][j], a[i][j-1]);
            }
        }
        System.out.println(a[s1.length()][s2.length()]);
    }
}