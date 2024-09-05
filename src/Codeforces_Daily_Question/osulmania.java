package Codeforces_Daily_Question;

import java.util.Scanner;

public class osulmania {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s[]=new String[n];
            for(int i=n-1;i>=0;i--)
                s[i]= sc.next();
            for(int i=0;i<n;i++){
                for(int j=0;j<4;j++)
                    if(s[i].charAt(j)=='#')
                        System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
