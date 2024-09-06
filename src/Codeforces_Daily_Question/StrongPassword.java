package Codeforces_Daily_Question;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s= sc.next();
            boolean flag=true;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    int i1 = (s.charAt(i) - 'a' + 1) % 26;
                    char ch=(char)(i1+97);
                    s=s.substring(0,i+1)+ch+s.substring(i+1,s.length());
                    flag=false;
                    break;
                }
            }
            if(flag){
                int i1 = (s.charAt(0) - 'a' + 1) % 26;
                char ch=(char)(i1+97);
                s=ch+s;
            }
            System.out.println(s);
        }
    }
}
