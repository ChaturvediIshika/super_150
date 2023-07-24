package Codeforces_Daily_Question;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='.')
                System.out.print(0);
            else if(str.charAt(i)=='-' && str.charAt(i+1)=='.'){
                i++;
                System.out.print(1);
            }
            else{
                i++;
                System.out.print(2);
            }
        }
    }
}
