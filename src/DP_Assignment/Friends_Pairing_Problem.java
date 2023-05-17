package DP_Assignment;

import java.util.Scanner;

public class Friends_Pairing_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            System.out.println(friend(n));
        }
    }
    public static int pair(int n,int sum){
        if(sum==n)
            return 1;
        if(sum>n)
            return 0;
        int inc=0,exc=0;
        if(sum+2<=n){
            inc=1+pair(n,sum+2);
        }
        exc=pair(n,sum+1);
        return inc+exc;
    }
    public static long friend(int n){
        if(n<=2)
            return n;
        return friend(n-1)+friend(n-2)*(n-1);
    }
}
