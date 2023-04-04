package Codeforces;

import java.util.Scanner;

public class Insert_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int c = 1;
            String str = sc.next();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) - '0' < d && c > 0) {
                    System.out.print(d);
                    c--;
                }
                System.out.print(str.charAt(i) - '0');
            }
            if (c == 1)
                System.out.print(d);
            System.out.println();
        }
    }
}
