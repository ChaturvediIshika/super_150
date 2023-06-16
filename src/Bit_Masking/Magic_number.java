package Bit_Masking;

//A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.
//First few magic numbers are 5, 25, 30(5+25), 125, 130(125+5).

import java.util.Scanner;

public class Magic_number {
    public static void main(String[] args) {
        int n=6;
        int pow=5;
        long sum=0;
        while(n>0){
            sum+=(n&1)*pow;
            pow=pow*5;
            n=n>>1;
        }
        System.out.println(sum);
    }
}
