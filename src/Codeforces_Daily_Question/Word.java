package Codeforces_Daily_Question;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=0,u=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                l++;
            else
                u++;
        }
        if(l<u)
            System.out.println(str.toUpperCase());
        else
            System.out.println(str.toLowerCase());
    }
}
