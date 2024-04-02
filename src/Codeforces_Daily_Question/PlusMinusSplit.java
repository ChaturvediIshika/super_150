package Codeforces_Daily_Question;

import java.util.Scanner;

public class PlusMinusSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s= sc.next();
            int c=0;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='+')
                    c++;
                else c--;
            }
            c=c>0?c:c*(-1);
            System.out.println(c);
        }
    }
}
