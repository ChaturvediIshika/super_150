package Codeforces_Daily_Question;

import java.util.Scanner;

public class PlusOneontheSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                min=Math.min(min,a[i]);
                max=Math.max(max,a[i]);
            }
            System.out.println(max-min);
        }
    }
}
