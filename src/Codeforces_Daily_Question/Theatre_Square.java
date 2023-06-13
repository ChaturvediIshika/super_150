package Codeforces_Daily_Question;

import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextInt();
        long n=sc.nextInt();
        long a=sc.nextInt();
        long k= (long) (Math.ceil((m*1.0)/a)*Math.ceil((n*1.0)/a));
        System.out.println(k);
    }
}
