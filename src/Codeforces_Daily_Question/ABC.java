package Codeforces_Daily_Question;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s= sc.next();
            if(s.length()<3){
                if(s.equals("11")||s.equals("00"))
                    System.out.println("NO");
                else System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
