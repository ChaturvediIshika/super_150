package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+')
                continue;
            ls.add(str.charAt(i)-'0');
        }
        String s="";
        Collections.sort(ls);
        for (int i=0;i<ls.size();i++)
            s+=ls.get(i)+"+";
        System.out.println(s.substring(0,s.length()-1));
    }
}
