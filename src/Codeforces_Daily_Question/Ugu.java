package Codeforces_Daily_Question;

import java.util.Scanner;

public class Ugu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str= sc.next();
            if(n==1)
                System.out.println(0);
            else {
                int c = 0, o = 0;
                for (int i = 0; i < n; i++) {
                    if (str.charAt(i) == '1') {
                        o=i;
                        break;
                    }
                }
                for (int i = o ; i < n - 1; i++) {
                    if (str.charAt(i) != str.charAt(i + 1))
                        c++;
                }
                System.out.println(c);
            }
        }
    }
}
