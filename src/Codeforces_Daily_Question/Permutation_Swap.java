package Codeforces_Daily_Question;

import java.util.Scanner;

public class Permutation_Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int min=n;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                b[i]=Math.abs(a[i]-i-1);
            }
            min=b[0];
            for(int i=1;i<n;i++){
                min=gcd(min,b[i]);
            }
            System.out.println(min);
        }
    }
    public static int gcd(int a, int b)
    {
        return (b == 0) ? a : gcd(b, a%b);
    }
}
