package Backtracking;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int s[][]=new int[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                s[i][j]=sc.nextInt();
            }
        }
        solver(s,0,0);
    }
    public static void solver(int s[][],int r,int c)
    {
        if(r==s.length)
        {
            r=0;
            c++;
        }
        if(c==s.length)
        {
            display(s);
            return;
        }
        if(s[r][c]!=0)
        {
            solver(s,r+1,c);
        }
        else
        {
            for (int val=1;val<= s.length;val++)
            {
                if(possible(s,r,c,val)==true)
                {
                    s[r][c]=val;
                    solver(s,r+1,c);
                    s[r][c]=0;
                }
            }
        }
    }
    public static boolean possible(int s[][],int r,int c,int val)
    {
        int col=0;
        while (col<s.length)
        {
            if(s[r][col]==val)
                return false;
            col++;
        }
        int row=0;
        while (row<s.length)
        {
            if (s[row][c]==val)
                return false;
            row++;
        }
        row=r-r%3;
        col=c-c%3;
        for (int i=row;i<row+3;i++)
        {
            for (int j=col;j<col+3;j++)
            {
                if(s[i][j]==val)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int a[][])
    {
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j< a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
