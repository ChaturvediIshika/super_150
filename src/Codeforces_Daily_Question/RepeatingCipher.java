package Codeforces_Daily_Question;

import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k=1,i=0;
        String str="";
        while(i<s.length()){
            str+=s.charAt(i);
            i+=k;
            k++;
        }
        System.out.println(str);
    }
}
