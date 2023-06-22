package Codeforces_Daily_Question;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(find(str));
    }
    public static String find(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='H' || ch=='Q' || ch=='9')
                return "YES";
        }
        return "NO";
    }
}
