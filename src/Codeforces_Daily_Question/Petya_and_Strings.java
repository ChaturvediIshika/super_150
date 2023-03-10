package Codeforces_Daily_Question;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        int q=s1.compareTo(s2);
        if(q==0)
            System.out.println(0);
        else if(q<0)
            System.out.println(-1);
        else
            System.out.println(1);
    }
}
