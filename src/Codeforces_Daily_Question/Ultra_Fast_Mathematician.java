package Codeforces_Daily_Question;

import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        for (int i=0;i<str2.length();i++){
            if(str1.charAt(i)==str2.charAt(i))
                System.out.print(0);
            else
                System.out.print(1);
        }
    }
}
