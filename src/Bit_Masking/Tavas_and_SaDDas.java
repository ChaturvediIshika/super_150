package Bit_Masking;

import java.util.Scanner;

public class Tavas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n));
    }
    public static long find(int n){
        String s=n+"";
        int l=s.length();
        long q=(1<<l)-2;
        int p=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='7'){
                q+=(1<<p);
            }
            p++;
        }
        return q+1;
    }
}
