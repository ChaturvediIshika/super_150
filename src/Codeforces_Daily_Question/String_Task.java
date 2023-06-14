package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next().toLowerCase();
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('o');
        hs.add('y');
        hs.add('e');
        hs.add('u');
        hs.add('i');
        String str="";
        for (int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i)))
                str+="."+s.charAt(i);
        }
        System.out.println(str);
    }
}
