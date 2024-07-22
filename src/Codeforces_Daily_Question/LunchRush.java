package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class LunchRush {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int f=sc.nextInt();
            int t=sc.nextInt();
            if(t>k)max=Math.max(max,f-(t-k));
            else max=Math.max(max,f);
        }
        System.out.println(max);
    }
}
