package DP_Assignment;

import java.util.Scanner;

public class Knapsack01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s= sc.nextInt();
        int p[]=new int[n];
        int w[]=new int[n];
        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            p[i]=sc.nextInt();
        int k[][]=new int[n+1][s+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<s+1;j++){
//                System.out.println(i+" "+j);
                if(i==0 || j==0)
                    k[i][j]=0;
                else if (w[i-1]<=j) {
                    k[i][j]=Math.max(p[i-1]+k[i-1][j-w[i-1]],k[i-1][j]);
                }
                else
                    k[i][j]=k[i-1][j];
            }
        }
//        for (int i=0;i<k.length;i++){
//            for (int j=0;j<k[0].length;j++)
//                System.out.print(k[i][j]+" ");
//            System.out.println();
//        }
        System.out.println(k[n][s]);
    }
}
