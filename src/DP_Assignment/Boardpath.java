package DP_Assignment;

import java.util.Scanner;

public class Boardpath {
    static int c=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        path(n,m,"",0);
        System.out.println();
        System.out.println(c);
    }
    public static void path(int n,int m,String str,int sum){
        if(n==sum)
        {
            System.out.print(str+" ");
            c+=1;
            return;
        }
        if(sum>n)
            return;
        for (int i=1;i<=m;i++)
            path(n,m,str+i,sum+i);
    }
}
