package Codeforces_Daily_Question;

import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
