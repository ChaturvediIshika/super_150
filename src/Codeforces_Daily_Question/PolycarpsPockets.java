package Codeforces_Daily_Question;

import java.util.Scanner;

public class PolycarpsPockets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[101];
        for(int i=0;i<n;i++){
            int idx= sc.nextInt();
            a[idx]++;
        }
        int max=0;
        for(int i=1;i<101;i++){
            max=Math.max(max,a[i]);
        }
        System.out.println(max);
    }
}
