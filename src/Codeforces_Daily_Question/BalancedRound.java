package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            Arrays.sort(a);
            int min=1,c=1;
            for(int i=1;i<n;i++){
                if(a[i]-a[i-1]<=k){
                    c++;
                    min=Math.max(min,c);
                }
                else
                    c=1;
            }
            System.out.println(n-min);
        }
    }
}
