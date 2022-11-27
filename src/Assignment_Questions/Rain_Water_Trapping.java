package Assignment_Questions;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            System.out.println(find(a,n));
        }
    }
    public static int find(int a[],int n)
    {
        int l[]=new int[n];
        int r[]=new int [n];
        l[0]=a[0];
        r[n-1]=a[n-1];
        for(int i=1;i<n;i++)
        {
            l[i]=Math.max(l[i-1],a[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            r[i]=Math.max(r[i+1],a[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(r[i],l[i])-a[i];
        }
        return sum;
    }
}
