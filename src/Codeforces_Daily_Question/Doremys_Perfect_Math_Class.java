package Codeforces_Daily_Question;

import java.util.Scanner;

public class Doremys_Perfect_Math_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            long a[]=new long[n];
            a[0]=sc.nextLong();
            long g=a[0],max=a[0];
            for (int i=1;i<n;i++){
                a[i]=sc.nextLong();
                g=gcd(a[i],g);
                max=Math.max(a[i],max);
            }
            System.out.println(max/g);
        }
    }
    public static long gcd(long a,long b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
