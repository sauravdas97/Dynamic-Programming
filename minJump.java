// find out the minimum jumps required to reach the array end
import java.util.Arrays;
class main
{
    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,1}; 
        int[] res = new int[a.length];
        for(int i = 0; i<res.length; i++)
            res[i] = Integer.MAX_VALUE;
        res[0] = 0;
        for(int i = 0; i<a.length-1; i++)
            for(int j = i+1; j<=a[i]+i && j<a.length; j++)
                res[j] = Math.min(res[i], 1+res[i]);

        for(int i:res)
            System.out.println(i);
        System.out.println(res[a.length-1]);
    }
}