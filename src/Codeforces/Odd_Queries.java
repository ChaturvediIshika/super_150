package Codeforces;

import java.util.Scanner;

public class Odd_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextLong();
            long l[]=new long[n+1];
            l[0]=0;
            long r[]=new long[n+1];
            r[n-1]=0;
            for (int i=1;i<n;i++)
                l[i]=l[i-1]+a[i-1];
            for (int i=n-1;i>0;i--)
                r[i]=r[i+1]+a[i];
            while (q-->0){
                int u=sc.nextInt()-1;
                int h=sc.nextInt();
                int k=sc.nextInt();
                long sum=0L+l[u]+r[h]+(1L*k*(h-u));
//                System.out.println(l[u]+" "+r[h]+" "+sum);
                if(sum%2!=0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
