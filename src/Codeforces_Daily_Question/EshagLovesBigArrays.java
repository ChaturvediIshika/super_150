package Codeforces_Daily_Question;

import java.util.Scanner;

public class EshagLovesBigArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0,min=Integer.MAX_VALUE;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                min=Math.min(min,a[i]);
            }
            for(int i=0;i<n;i++){
                if(a[i]==min)
                    c++;
            }
            System.out.println(n-c);
        }
    }
}
