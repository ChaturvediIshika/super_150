package Codeforces_Daily_Question;

import Inheritance.P;

import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int i=0,j=n-1;
            while (i<j) {
                System.out.print(a[i]+" "+a[j]+" ");
                i++;
                j--;
            }
            if(n%2!=0)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
