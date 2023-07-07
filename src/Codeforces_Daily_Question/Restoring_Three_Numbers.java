package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println((a[3]-a[0])+" "+(a[3]-a[1])+" "+(a[3]-a[2]));
    }
}
