package Codeforces_Daily_Question;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="qwertyuiop";
        String s2="asdfghjkl;";
        String s3="zxcvbnm,./";
        char ch=sc.next().charAt(0);
        String str= sc.next();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(ch=='R') {
                if (s1.indexOf(str.charAt(i)) != -1)
                {
                    ans+=s1.charAt(s1.indexOf(str.charAt(i))-1);
                }
                else if (s2.indexOf(str.charAt(i)) != -1)
                {
                    ans+=s2.charAt(s2.indexOf(str.charAt(i))-1);
                }
                if (s3.indexOf(str.charAt(i)) != -1)
                {
                    ans+=s3.charAt(s3.indexOf(str.charAt(i))-1);
                }
            }
            else {
                if (s1.indexOf(str.charAt(i)) != -1)
                {
                    ans+=s1.charAt(s1.indexOf(str.charAt(i))+1);
                }
                else if (s2.indexOf(str.charAt(i)) != -1)
                {
                    ans+=s2.charAt(s2.indexOf(str.charAt(i))+1);
                }
                if (s3.indexOf(str.charAt(i)) != -1)
                {
                    ans+=s3.charAt(s3.indexOf(str.charAt(i))+1);
                }
            }
        }
        System.out.println(ans);
    }
}
