package Codeforces_Daily_Question;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,sum=0;
        for (int i=0;i<n;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            sum=sum-a+b;
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
