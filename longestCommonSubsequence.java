// find the longest ommon subsequence between two strings
class main {
    public static void main(String[] args) {
        String p = "abcdef";
        String q = "abcdef";
        int[][] a = new int[p.length()+1][q.length()+1];
        // for(int i = 0; i<p.length(); i++)
        //     for(int j = 0; j<q.length(); j++)
        //         if(i==0 || j == 0)
        //             a[i][j] = 0;
        
        for(int i = 1; i<=p.length(); i++)
        {
            for(int j = 1; j<=q.length(); j++)
            {
                if(p.charAt(i-1) == q.charAt(j-1))
                    a[i][j] = 1 + a[i-1][j-1];
                else
                    a[i][j] = Math.max(a[i-1][j], a[i][j-1]);
            }
        }
        System.out.println(a[p.length()][q.length()]);
    }
}