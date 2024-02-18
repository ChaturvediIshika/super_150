package Codeforces_Daily_Question;

import java.util.Scanner;

public class CompareTShirtSizes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s1=sc.next();
            String s2= sc.next();
            if(s1.equals(s2))
                System.out.println("=");
            else {
                if(s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1)){
                    if(s1.charAt(s1.length()-1)=='S'){
                        System.out.println(s1.length()>s2.length()?"<":">");
                    }
                    if(s1.charAt(s1.length()-1)=='L'){
                        System.out.println(s1.length()>s2.length()?">":"<");
                    }
                }
                else{
                    if(s1.charAt(s1.length()-1)=='S'){
                        System.out.println("<");
                    } else if (s2.charAt(s2.length()-1)=='S') {
                        System.out.println(">");
                    }
                    else{
                        if(s1.charAt(s1.length()-1)=='M')
                            System.out.println("<");
                        else
                            System.out.println(">");
                    }
                }
            }
        }
    }
}
