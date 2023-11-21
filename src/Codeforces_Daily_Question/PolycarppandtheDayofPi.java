package Codeforces_Daily_Question;

import java.util.Scanner;

public class PolycarppandtheDayofPi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        String pi="314159265358979323846264338327";
        while (t-->0){
            String s= sc.next();
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==pi.charAt(i))
                    c++;
                else
                    break;
            }
            System.out.println(c);
        }
    }
}
