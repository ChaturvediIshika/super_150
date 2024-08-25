package Codeforces_Daily_Question;

import java.util.Scanner;

public class CaisaandPylons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++)
            max=Math.max(sc.nextInt(),max);
        System.out.println(max);
    }
}
