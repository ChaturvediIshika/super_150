package Codeforces_Daily_Question;

import java.util.Scanner;

public class DenseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int c=0;
            for(int i=0;i<n-1;i++){
                int min=Math.min(a[i],a[i+1]);
                int max=Math.max(a[i],a[i+1]);
                while (min*2<max){
                    c++;
                    min*=2;
                }
            }
            System.out.println(c);
        }
    }
}
