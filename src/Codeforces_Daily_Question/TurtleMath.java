package Codeforces_Daily_Question;

import java.util.Scanner;

public class TurtleMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            long s=0;
            while (n-->0){
                int a=sc.nextInt();
                if (a%3==1)k++;
                s+=a;
            }
            System.out.println(s%3==0?0:s%3==2||(s%3==1&&k!=0)?1:2);
        }
    }
}
