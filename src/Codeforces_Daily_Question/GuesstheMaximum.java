package Codeforces_Daily_Question;

import java.util.Scanner;

public class GuesstheMaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            a[0]=sc.nextInt();
            int min=Integer.MAX_VALUE;
            for(int i=1;i<n;i++) {
                a[i]= sc.nextInt();
                int max=Math.max(a[i-1],a[i]);
                min=Math.min(min,max);
            }
            System.out.println(min-1);
        }
    }
}
