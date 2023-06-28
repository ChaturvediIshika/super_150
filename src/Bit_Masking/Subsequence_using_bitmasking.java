package Bit_Masking;

import java.util.Scanner;

public class Subsequence_using_bitmasking {
    public static void main(String[] args) {
        String str="abc";
        subsequence(str);
    }
    public static void subsequence(String str){
        int n=str.length();
        for(int i=0;i<(1<<n);i++){
            pattern(i,str);
        }
    }
    public static void pattern(int i,String str){
        int pos=0;
        while (i>0){
            if((i&1)!=0)
                System.out.print(str.charAt(pos));
            i>>=1;
            pos++;
        }
        System.out.println();
    }
}
