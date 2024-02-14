package Codeforces_Daily_Question;

import java.util.Scanner;

public class DominoDisaster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String s= sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='U')
                    System.out.print("D");
                else if(s.charAt(i)=='D')
                    System.out.print("U");
                else
                    System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
