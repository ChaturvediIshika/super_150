package Codeforces_Daily_Question;

import java.util.Scanner;

public class Burenka_Plays_with_Fractions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d= sc.nextLong();
            long e=a*d;
            long f=b*c;
            if(a*d==b*c)
                System.out.println(0);
            else if(e==0 || f==0 || e%f==0 || f%e==0)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
