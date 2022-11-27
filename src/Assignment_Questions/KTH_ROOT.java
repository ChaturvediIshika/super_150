package Assignment_Questions;

import java.util.Scanner;

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            long n= sc.nextLong();
            long k= sc.nextLong();
            System.out.println(find(n,k));
        }
    }
    public static long find(long n,long k)
    {
        long l=1,h=n,mid=0,ans=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if((long)Math.pow(mid,k)==n)
                return mid;
            else if ((long)Math.pow(mid,k)>n) {
                h=mid-1;
            }
            else {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}
