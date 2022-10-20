package leetcode;

import java.util.Scanner;

public class Rat_And_Cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        sc.nextLine();
        char arr[][]=new char[m][n];
        for (int i=0;i<m;i++)
        {
            String str= sc.nextLine();
            for(int j=0;j<n;j++)
            {
                arr[i][j]=str.charAt(j);
            }
        }
       int q[][]=new int[m][n];
        Rat(arr,q,0,0,m,n);
    }
    public static void Rat(char arr[][],int q[][],int i,int j,int m,int n)
    {
        if(i<0 || i>=m || j<0 || j>=n || arr[i][j]=='X')
        {
            return;
        }
        if(i==m-1 && j==n-1)
        {
            q[i][j]=1;
            display(q);
            return;
        }
        arr[i][j]='X';
        q[i][j]=1;
        Rat(arr,q,i+1,j,m,n);
        Rat(arr,q,i-1,j,m,n);
        Rat(arr,q,i,j+1,m,n);
        Rat(arr,q,i,j-1,m,n);
        arr[i][j]='O';
        q[i][j]=0;
    }
    public static void display(int q[][])
    {
        for(int i=0;i<q.length;i++) {
            for (int j = 0; j < q[0].length; j++) {
                System.out.print(q[i][j]);
            }
            System.out.println();
        }
    }
}
