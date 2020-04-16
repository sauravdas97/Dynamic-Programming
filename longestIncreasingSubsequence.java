// {7,1,4,8,11,2,14,3} in this array the longest increasing subsequence is 1,4,8,11,14 and th elength is 5
import java.util.Arrays;

class main 
{
    public static void main(String[] args) {
        int[] a = {7,1,4,8,11,2,14,3};
        int[] lis = new int[a.length]; // lis is the longest increasing subsequesce array
        Arrays.fill(lis, 1);

        for(int i = 1; i<a.length; i++)
            for(int j = 0; j<i; j++)
                if(a[j]<a[i] && lis[j]+1>lis[i])
                    lis[i] = lis[j]+1;
        int m = 0;
        for(int i : lis)
            m = Math.max(m,i);
        System.out.println(m);
    }
}