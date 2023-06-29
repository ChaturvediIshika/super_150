package Bit_Masking;

import java.util.Scanner;

public class Ehab_the_Xorcist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long u= sc.nextLong();
        long v=sc.nextLong();
        ehab(u,v);
    }
    public static void ehab(long u,long v){
        if(u>v || (v-u)%2!=0){
            System.out.println(-1);
            return;
        }
        if(u==0 && v==0){
            System.out.println(0);
            return;
        }
        if(u==v){
            System.out.println(1);
            System.out.println(v);
            return;
        }
        long x=(v-u)/2;
        if((u&x)==0){
            System.out.println(2);
            System.out.println((u+x)+" "+x);
        }
        else{
            System.out.println(3);
            System.out.println(u+" "+x+" "+x);
        }
    }
}
