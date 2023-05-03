package DP_Assignment;

//Given a board of size 2xn , you have place 2x1 tiles . You can place the tile horizontally or vertically . Print the number of ways.

import java.util.Scanner;

public class Tilling_Problem_I {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fiboBU(n));
    }
    public static long fiboBU(int n){
        long a[]=new long[n+2];
        if(n>0)
            a[1]=1;
        for(int i=2;i<=n+1;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n+1];
    }
}
