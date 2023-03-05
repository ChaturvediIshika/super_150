package Codeforces_Daily_Question;

import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
            int l=str.length();
            if(l<=10)
                System.out.println(str);
            else{
                String s=""+str.charAt(0);
                s+=l-2;
                s+=str.charAt(l-1);
                System.out.println(s);
            }
        }
    }
}
