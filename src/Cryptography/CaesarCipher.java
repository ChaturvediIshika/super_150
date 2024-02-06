package Cryptography;

import java.util.Locale;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1:encode, 2:decode, 3:brute force");
        int ch=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter message");
        String s= sc.nextLine();
        switch (ch){
            case 1:
                System.out.println("Enter shift");
                int k= sc.nextInt();
                encrypt(s,k);
                break;
            case 2:
                System.out.println("Enter shift");
                k= sc.nextInt();
                decrypt(s,k);
                break;
            case 3:
                brute(s);
                break;
            case 4:
                k=1;
                String str="";
                for(int i=0;i<s.length();i++){
                    str+=(char)(32+(s.charAt(i)-' '+k)%98);
                }
                System.out.println(str);
        }
    }
    public static void encrypt(String s,int shift){
        s=s.toUpperCase();
        String str="";
        for(int i=0;i<s.length();i++){
            str+=(char)(65+(s.charAt(i)-'A'+shift)%26);
        }
        System.out.println(str);
    }
    public static void decrypt(String s,int shift){
        s=s.toUpperCase();
        String str="";
        for(int i=0;i<s.length();i++){
            str+=(char)(97+(s.charAt(i)-'A'+26-shift)%26);
        }
        System.out.println(str);
    }
    public static void brute(String s){
        s=s.toUpperCase();
        for (int i=0;i<26;i++){
            String str="";
            for(int j=0;j<s.length();j++){
                str+=(char)(65+(s.charAt(j)-'A'+i)%26);
            }
            System.out.println(i+" "+str);
        }
    }
}
