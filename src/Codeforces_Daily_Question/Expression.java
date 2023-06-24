package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        a[0]= sc.nextInt();
        a[1]= sc.nextInt();
        a[2]= sc.nextInt();
        int max=a[0]+a[1]+a[2];
        max=Math.max(max,(a[0]+a[1])*a[2]);
        max=Math.max(max,(a[1]+a[2])*a[0]);
        max=Math.max(max,a[0]*a[1]*a[2]);
        System.out.println(max);
    }
}
