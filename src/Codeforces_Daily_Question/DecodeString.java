package Codeforces_Daily_Question;

import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int i=0;
            String str="";
            while (i<s.length()){
                if(i+2<s.length() && s.charAt(i+2)=='0'){
                    int k=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
                    str+=(char)(k+96);
                    i+=3;
                }
                else{
                    str+=(char)(s.charAt(i)-'0'+96);
                    i++;
                }
            }
            System.out.println(str);
        }
    }
}
