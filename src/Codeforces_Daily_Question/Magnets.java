package Codeforces_Daily_Question;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        int k=sc.nextInt();
        for (int i=0;i<n-1;i++){
            int r=sc.nextInt();
            if(k!=r){
                c++;
                k=r;
            }
        }
        System.out.println(c);
    }
}
