package Codeforces_Daily_Question;

import java.util.Scanner;

public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=Math.min(n*a,n/m*b+n%m*a);
        sum=Math.min(sum,n/m*b+b);
        System.out.println(sum);
    }
}
