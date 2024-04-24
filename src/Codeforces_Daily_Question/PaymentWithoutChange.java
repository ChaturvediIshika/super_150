package Codeforces_Daily_Question;

import java.util.Scanner;

public class PaymentWithoutChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int n= sc.nextInt();
            int s= sc.nextInt();
            int d=s/n;
            s-=Math.min(a,d)*n;
            if(s<=b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
