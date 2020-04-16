// {7,1,4,8,11,2,14,3} find the max sum of an increasing subsequence. Here this subsequence (7,8,11,14) has the maximum sum
class main 
{
    public static void main(String[] args) {
        int[] a = {7,1,4,8,11,2,14,3};
        int[] res = new int[a.length];
        
        for (int i = 0; i < res.length; i++)
            res[i] = a[i];

        for (int i = 1; i < res.length; i++)
            for (int j = 0; j < i ; j++)
                if(a[j]<a[i])
                    res[i] = Math.max(res[i], a[i]+res[j]);
        int m = 0;
        for(int i:res)
            m = Math.max(i,m);  
        System.out.println(m);
    }
}