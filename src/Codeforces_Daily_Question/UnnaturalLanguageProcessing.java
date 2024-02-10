package Codeforces_Daily_Question;

import java.util.Scanner;

public class UnnaturalLanguageProcessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String s= sc.next();
            int i=0;
            StringBuilder str=new StringBuilder();
            while (i<n-1){
                if(i<n-1 && s.charAt(i)!='a' && s.charAt(i)!='e'){
                    str.append(s.charAt(i)+""+s.charAt(i+1));
                    i+=2;
//                    System.out.println(i);
                    if(i<n-1 && s.charAt(i+1)!='a' && s.charAt(i+1)!='e'){
                        str.append(s.charAt(i)+".");
                        i++;
                    }
                    else
                        str.append(".");
                }
//                System.out.println(str);
            }
            str= new StringBuilder(str.substring(0, str.length() - 1) + s.charAt(n - 1));
            if(s.charAt(n-1)=='a' || s.charAt(n-1)=='e')
                str= new StringBuilder(str.substring(0, str.length() - 1));
            System.out.println(str);
        }
    }
}
