package Codeforces_Daily_Question;

import java.util.Scanner;

public class WeGotEverythingCovered {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            String s="";
            for(int i=0;i<k;i++)
                s+=(char)(97+i);
            String str="";
            for(int i=0;i<n;i++)
                str+=s;
            System.out.println(str);
        }
    }
}
