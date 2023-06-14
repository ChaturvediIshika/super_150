package Advance_topics;

import java.util.Scanner;

public class Hashing {  //string polynomial technique
    public static void main(String[] args) {
        String s="apple";
        System.out.println(hascode(s));
    }
    public static int hascode(String s){
        long mod=1000_000_007;
        int pow=1;
        long ans=0;
        int prime=31;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans=(ans+((ch-'a'+1)*pow)%mod)%mod;
            ans=(ans+mod)%mod;
            pow= (int) ((pow*prime)%mod);
        }
        return (int)ans;
    }
}
