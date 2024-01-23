package Codeforces_Daily_Question;

import java.util.Scanner;

public class DEraser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s= sc.next();
            int i=0,c=0;
            while (i<n){
                if(s.charAt(i)=='B') {
                    i += k;
                    c++;
                }
                else
                    i++;
            }
            System.out.println(c);
        }
    }
}
