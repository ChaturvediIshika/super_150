package Codeforces_Daily_Question;

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t= sc.nextLine();
        int p=0;
        for (int i=0;i<t.length();i++){
            if(s.charAt(p)==t.charAt(i))
                p++;
        }
        System.out.println(p+1);
    }
}
