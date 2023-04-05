package Codeforces_Daily_Question;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=1;i<=n;i++){
            int q=sc.nextInt();
            a[q-1]=i;
        }
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
