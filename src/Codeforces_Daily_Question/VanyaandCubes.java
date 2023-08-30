package Codeforces_Daily_Question;

import java.util.Scanner;

public class VanyaandCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int l=0;
        int c=1;
        int k=2;
        while (c<=n){
            n-=c;
            c+=k;
            k++;
            l++;
        }
        System.out.println(l);
    }
}
