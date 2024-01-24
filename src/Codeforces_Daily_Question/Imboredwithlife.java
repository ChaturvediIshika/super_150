package Codeforces_Daily_Question;

import java.util.Scanner;

public class Imboredwithlife {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int min=Math.min(a,b);
        int sum=1;
        for(int i=2;i<=min;i++)
            sum*=i;
        System.out.println(sum);
    }
}
