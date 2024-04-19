package Codeforces_Daily_Question;

import java.util.Scanner;

public class TeamComposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            long a= sc.nextLong();
            long b=sc.nextLong();
            long d=(a+b)/4;
            if(a>=d && b>=d)
                System.out.println(d);
            else
                System.out.println(Math.min(a,b));
        }
    }
}
