package Codeforces_Daily_Question;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int c=1,max=1;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1])
                c++;
            else{
                max=Math.max(c,max);
                c=1;
            }
        }
        max=Math.max(max,c);
        System.out.println(max);
    }
}
