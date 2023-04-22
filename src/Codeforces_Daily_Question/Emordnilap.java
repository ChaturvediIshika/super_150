package Codeforces_Daily_Question;

import java.util.Scanner;

public class Emordnilap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=1000000007;
        while (t-->0){
            int n= sc.nextInt();
            long sum=1;
            for(long i=2;i<=n;i++){
                sum=(sum%m*i%m)%m;
            }
            System.out.println((sum*n)%m*(n-1)%m);
        }
    }
}
