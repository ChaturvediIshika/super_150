package Codeforces_Daily_Question;

import java.util.Scanner;

public class MaximuminTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            a[0][i]=1;
        }
        if(n==1)
            System.out.println(1);
        else{
            for(int i=1;i<n;i++)
                a[i][0]=1;
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                    a[i][j]=a[i-1][j]+a[i][j-1];
                }
            }
            System.out.println(a[n-1][n-1]);
        }
    }
}
