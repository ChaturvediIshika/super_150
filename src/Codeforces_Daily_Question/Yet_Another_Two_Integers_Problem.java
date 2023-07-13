package Codeforces_Daily_Question;

import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a = Math.abs(b - a);
            int k = a / 10;
            if (a % 10 > 0)
                k++;
            System.out.println(k);
        }
    }
}
