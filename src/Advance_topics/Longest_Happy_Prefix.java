package Advance_topics;

import java.util.Scanner;

public class Longest_Happy_Prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(lps(str));
    }
    public static String lps(String s){
        int a[]=new int[s.length()];
        int l=0;
        for(int i=1;i<s.length();){
            if(s.charAt(i)==s.charAt(l)){
                l++;
                a[i]=l;
                i++;
            }
            else{
                if(l>0){
                    l=a[l-1];
                }
                else{
                    a[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0,l);
    }
}
