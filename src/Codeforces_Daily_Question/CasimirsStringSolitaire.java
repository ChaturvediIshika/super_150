package Codeforces_Daily_Question;

import java.util.Scanner;

public class CasimirsStringSolitaire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s= sc.nextLine();
            int A=0,B=0,C=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A')
                    A++;
                else if(s.charAt(i)=='B')
                    B++;
                else
                    C++;
            }
            if(A+C==B)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
