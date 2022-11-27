package Assignment_Questions;

import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P= sc.nextInt();
        int L= sc.nextInt();
        int R[]=new int[L];
        for (int i=0;i<L;i++)
            R[i]= sc.nextInt();
        int t=search(P,L,R);
        System.out.println(t);
    }
    public static int search(int P,int L,int R[])
    {
        int l=0,h=Integer.MAX_VALUE,mid=0,ans=0;
        while(h>=l)
        {
            mid=(l+h)/2;
            if(find(P,L,R,mid))
            {
                ans=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean find(int P,int L,int R[],int mid)
    {
        int c=0;
        for(int i=0;i<L;i++)
        {
            int q=R[i];
            int j=2;
            while(q<=mid)
            {
                q+=(R[i]*j);
                j++;
                c++;
                if(c==P)
                    return true;
            }
        }
        return false;
    }
}
