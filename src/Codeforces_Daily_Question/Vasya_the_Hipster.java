package Codeforces_Daily_Question;

import java.util.Scanner;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        System.out.println(Math.min(n,m)+" "+((m-Math.min(m,n)+n-Math.min(m,n))/2));
    }
}
