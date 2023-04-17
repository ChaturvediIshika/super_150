package Codeforces_Daily_Question;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String str= sc.next().toLowerCase();
        if(n<26)
            System.out.println("NO");
        else {
            int a[] = new int[26];
            for (int i = 0; i < str.length(); i++)
                a[str.charAt(i) - 'a']++;
            int f = 0;
            for (int i = 0; i < 26; i++) {
                if (a[i] == 0) {
                    f = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if (f == 0)
                System.out.println("YES");
        }
    }
}
