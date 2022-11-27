package Assignment_Questions;

import java.util.Scanner;

public class Arrays_Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int t= sc.nextInt();
        System.out.println(find(a,t));
    }
    public static int find(int a[],int t)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==t)
                return i;
        }
        return -1;
    }
}
