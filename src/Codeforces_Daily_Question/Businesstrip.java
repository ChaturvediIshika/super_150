package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Businesstrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a[]=new int[12];
        for (int i=0;i<12;i++)
            a[i]= sc.nextInt();
        Arrays.sort(a);
        int i=11;
        int c=0;
        while (k>0 && i>=0){
            k-=a[i];
            c++;
            i--;
        }
        if(k>0)
            System.out.println(-1);
        else
        System.out.println(c);
    }
}
