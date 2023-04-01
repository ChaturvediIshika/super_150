package Codeforces_Daily_Question;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int w=0;
        for (int i=0;i<n;i++){
            int d=sc.nextInt();
            if(d>h)
                w+=2;
            else
                w+=1;
        }
        System.out.println(w);
    }
}
