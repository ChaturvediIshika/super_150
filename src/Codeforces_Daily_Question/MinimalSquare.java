package Codeforces_Daily_Question;

import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = 2 * Math.min(a, b);
            int side = Math.max(s, Math.max(a, b));
            System.out.println(side * side);
        }
    }
}
