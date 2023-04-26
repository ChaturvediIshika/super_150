package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Hossam_and_Combinatorics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                max=Math.max(a[i],max);
                min=Math.min(a[i],min);
            }
            long p=0,q=0;
            for(int i=0;i<n;i++){
                if(a[i]==max)
                    p++;
                if(a[i]==min)
                    q++;
            }
            if(max==min)
                System.out.println(p*(p-1));
            else
            System.out.println(p*q*2);
        }
    }
}
