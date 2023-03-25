package Codeforces;

import java.util.Scanner;

public class Stripes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int r=0,b=0;
            String str[]=new String[8];
            for (int j=0;j<8;j++){
                str[j]=sc.next();
            }
            int maxr=0,maxb=0;
            for(int i=0;i<8;i++){
                r=0;
                for(int j=0;j<8;j++){
                    if(str[i].charAt(j)=='R')
                        r++;
                }
                maxr=Math.max(maxr,r);
            }
            for(int i=0;i<8;i++){
                b=0;
                for(int j=0;j<8;j++){
                    if(str[j].charAt(i)=='B')
                        b++;
                }
                maxb=Math.max(maxb,b);
            }
            if(maxr>maxb)
                System.out.println("R");
            else
                System.out.println("B");
        }
    }
}
