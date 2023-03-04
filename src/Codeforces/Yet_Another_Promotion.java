package Codeforces;

import java.util.Scanner;

public class Yet_Another_Promotion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b= sc.nextLong();
            long n=sc.nextLong();
            long m=sc.nextLong();
            long div=n/(m+1);
            long rem=n%(m+1);
            long suma=Math.min(rem*a,rem*b);
            long sumb=Math.min((n-rem-div)*a,(n-rem)*b);
            System.out.println(suma+sumb);
        }
    }
}
