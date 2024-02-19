package Cryptography;

import java.util.Scanner;

public class VignereCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,3,5,7,9,11,15,17,19,21,23,25};
        System.out.println("Enter Choice: 1-Encrypt, 2-Decrypt, 3-brute force, 4-all keys");
        int ch=sc.nextInt();
        String str="",s="";
        String key="PASCAL";
        int i=0,j=0;
        switch (ch) {
            case 1:
                s= sc.next();
                while (i<s.length()){
                    str+=(char)(65+(s.charAt(i)-'a'+key.charAt(j)-'A')%26);
                    i++;j++;
                    j=j%key.length();
                }
                System.out.println(str);
                break;
            case 2:
                str= sc.next();
                while (i<str.length()){
                    s+=(char)(97+(26+(str.charAt(i)-key.charAt(j)))%26);
                    i++;
                    j++;
                    j=j%key.length();
                }
                System.out.println(s);
                break;
        }
    }
}
