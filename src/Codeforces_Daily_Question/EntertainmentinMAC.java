package Codeforces_Daily_Question;

import java.util.Scanner;

public class EntertainmentinMAC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s= sc.next();
            StringBuilder str=new StringBuilder(s);
            str.reverse();
            String sq=str.toString();
            if(s.compareTo(sq)<=0)
                System.out.println(s);
            else
                System.out.println(sq+s);
        }
    }
}
