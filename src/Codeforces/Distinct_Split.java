package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct_Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str= sc.next();
            System.out.println(distinct(str));
        }
    }
    public static int distinct(String str){
        int f1[]=new int[str.length()];
        int f2[]=new int[str.length()];
        Set<Character> set=new HashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
            f1[i]=set.size();
        }
        set.clear();
        for (int i=str.length()-1;i>=0;i--){
            set.add(str.charAt(i));
            f2[i]=set.size();
        }
        int m=0;
        for (int i=0;i<str.length()-1;i++)
            m=Math.max(m,f1[i]+f2[i+1]);
        return m;
    }
}
