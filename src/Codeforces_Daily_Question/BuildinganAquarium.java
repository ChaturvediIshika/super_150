package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class BuildinganAquarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            Arrays.sort(a);
            long l=1,h=Integer.MAX_VALUE,ans=1;
            while (l<=h){
                long mid=l+(h-l)/2;
                int q=find(a,mid,x);
                if(q==0){
                    ans=mid;
                    break;
                }
                else if(q==1){
                    h=mid-1;
                    ans=mid-1;
                }
                else
                    l=mid+1;
            }
            System.out.println(ans);
        }
    }
    public static int find(long a[],long m,long x){
        long sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<m)
                sum+=(m-a[i]);
            else
                break;
        }
//        System.out.println(sum+" "+m);
        if(sum==x)
            return 0;
        if(sum>x)
            return 1;
        return -1;
    }
}
