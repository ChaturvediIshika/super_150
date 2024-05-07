package Codeforces_Daily_Question;

import java.util.Scanner;

public class LongLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Long a[]=new Long[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextLong();
            long sum=0;
            long c=0;
            int i=0,j=n-1;
            while (i<n){
                if(a[i]>=0){
                    sum+=a[i++];
                    continue;
                }
                c++;
                sum+=-1*a[i++];
                while(i<n&&a[i]<=0){
                    sum+=-1*a[i++];
                }
            }
            System.out.println(sum+" "+c);
        }
    }
}
