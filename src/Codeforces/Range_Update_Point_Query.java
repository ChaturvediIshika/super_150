package Codeforces;

import java.util.Scanner;

public class Range_Update_Point_Query {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q= sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            while (q-->0){
                int z= sc.nextInt();
                if(z==1){
                    int l=sc.nextInt();
                    int r= sc.nextInt();
                    range(a,l,r);
                }
                else {
                    int x=sc.nextInt();
                    System.out.println(point(a,x));
                }
            }
        }
    }
    public static void range(int a[],int l,int r){
        for (int i=l-1;i<r;i++){
            if(a[i]<10)
                continue;
            else {
                int n=a[i],s=0;
                while (n>0){
                    s+=n%10;
                    n=n/10;
                }
                a[i]=s;
            }
        }
    }
    public static int point(int a[],int x){
        return a[x-1];
    }
}
