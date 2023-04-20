package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Valentine_Magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[n];
        for (int i=0;i<n;i++)
            b[i]= sc.nextInt();
        int g[]=new int[m];
        for (int i=0;i<m;i++)
            g[i]= sc.nextInt();
        Arrays.sort(b);
        Arrays.sort(g);
        System.out.println(diff(b,g,0,0));
    }
    public static int diff(int b[],int g[],int i,int j){
        if(i==b.length)
            return 0;
        if(j==g.length)
            return 10000000;
        int pair=Math.abs(b[i]-g[j])+diff(b,g,i+1,j+1);
        int Nopair=diff(b,g,i,j+1);
        return Math.min(pair,Nopair);
    }
}
