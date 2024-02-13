package Codeforces_Daily_Question;

import java.util.Scanner;

public class ArrangingCats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            int c1=0,c2=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)>s2.charAt(i))
                    c1++;
                if(s2.charAt(i)>s1.charAt(i))
                    c2++;
            }
            System.out.println(Math.max(c1,c2));
        }
    }
}
