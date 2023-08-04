package Codeforces_Daily_Question;

import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int n= sc.nextInt();
            int q=n/x;
            if(x*q+y<=n){
                System.out.println(x*q+y);
            }
            else
                System.out.println(x*(q-1)+y);
        }
    }
}
