package Codeforces;

import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="codeforces";
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char ch= s.charAt(0);
            check(ch,str);
        }
    }
    public static void check(char ch,String str){
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
