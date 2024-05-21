package Codeforces_Daily_Question;

import java.util.Scanner;

public class DifferentString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            int flag = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) != s.charAt(i)) {
                    String st = s.substring(1, s.length()) + s.substring(0, 1);
                    System.out.println("YES");
                    System.out.println(st);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("NO");
            }
        }
    }
}
