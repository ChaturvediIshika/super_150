package Codeforces_Daily_Question;

import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
    }
}
