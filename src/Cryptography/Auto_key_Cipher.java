package Cryptography;

import java.util.Scanner;

public class Auto_key_Cipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice: 1-Encrypt, 2-Decrypt, 3-brute force");
        int ch=sc.nextInt();
        String str="",s="";
        int k=12;
        switch (ch){
            case 1:
                System.out.println("Enter plain text");
                s= sc.next();
                str+=(char)(65+((s.charAt(0)-'a'+k)%26));
                for(int i=1;i<s.length();i++){
                    str+=(char)(65+((s.charAt(i)-'a'+(s.charAt(i-1)-'a'))%26));
                }
                System.out.println(str);
                break;
            case 2:
                str= sc.next();
                s+=(char)('a'+((26+str.charAt(0)-'A'-k)%26));
                for(int i=1;i<str.length();i++){
                    s+=((char)('a'+((26+str.charAt(i)-'A'-s.charAt(i-1)+'a')%26)));
                }
                System.out.println(s);
                break;
            case 3:
                System.out.println("enter encrypted");
                str= sc.next();
                System.out.println("enter decrypted");
                s= sc.next();
                k=((26+(str.charAt(0)-'A')-(s.charAt(0)-'a'))%26);
                System.out.println(k);
        }
    }
}
