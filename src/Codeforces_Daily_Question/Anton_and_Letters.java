package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for (int i=0;i<str.length();i++) {
            hs.add(str.charAt(i));
//            System.out.println(str.charAt(i));
        }
//        System.out.println(hs);
        if(hs.size()==2)
            System.out.println(0);
        else if (hs.size()==3)
            System.out.println(1);
        else
        System.out.println(hs.size()-4);
    }
}
