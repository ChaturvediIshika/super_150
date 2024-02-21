package Codeforces_Daily_Question;

import java.util.Scanner;

public class VladandtheBestofFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int a=0,b=0;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='A')
                    a++;
                else
                    b++;
            }
            System.out.println(a>b?'A':'B');
        }
    }
}
