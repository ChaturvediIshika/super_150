package Codeforces_Daily_Question;

import java.util.Scanner;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
            String str2=str.charAt(0)+"";
            for (int i=1;i<str.length()-1;i+=2){
                str2+=str.charAt(i);
            }
            str2+=str.charAt(str.length()-1);
            System.out.println(str2);
        }
    }
}
