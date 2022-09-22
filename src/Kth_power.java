

import java.util.Scanner;

import static java.lang.Math.*;

public class Kth_power {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=find_X(n,k);
            System.out.println(x);
        }
    }
    public static long find_X(long n,long k)
    {
        long l=1;
        long u=n;
        long ans=0;
        while(l<=u)
        {
            long mid=(l+u)/2;
            if((long) pow(mid,k)<=n)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                u=mid-1;
            }
        }
        return ans;
    }
}
