package Cryptography;

import java.util.Scanner;

public class Multiplicative_cipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,3,5,7,9,11,15,17,19,21,23,25};
        System.out.println("Enter Choice: 1-Encrypt, 2-Decrypt, 3-brute force");
        int ch=sc.nextInt();
        String str="",s="";
        int k=3;
        switch (ch){
            case 1:
                System.out.println("Enter plain text");
                s= sc.next();
                str="";
                for(int i=0;i<s.length();i++){
                    str+=(char)(65+((s.charAt(i)-'a')*k)%26);
                }
                System.out.println("Encrypted Text: "+str);
                break;
            case 2:
                str=sc.next();
                s="";
                int k_inv=0;
                for(int i:a){
                    if((k*i)%26==1){
                        k_inv=i;
                        break;
                    }
                }
                s="";
                for(int i=0;i<str.length();i++){
                    s+=(char)(97+((str.charAt(i)-'A')*k_inv)%26);
                }
                System.out.println("Decrypted Text: "+s);
                break;
            case 3:
                System.out.println("enter encrypted");
                str= sc.next();
                System.out.println("enter decrypted");
                s= sc.next();
                for(int i:a){
                    boolean f=false;
                    for(int z=0;z<s.length();z++) {
                        if (((char) (65 + ((s.charAt(z) - 'a') * i) % 26)) != (str.charAt(z))) {
                            f=true;
                        }
                    }
                    if(!f) {
                        System.out.println(i);
                        break;
                    }
                }
        }
    }
}
