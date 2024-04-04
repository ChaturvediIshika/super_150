package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            Arrays.sort(a);
            if(a[0] == a[a.length-1]){
                System.out.println(-1);
            }

            for(int i = 0 ; i < a.length - 1 ; i++){
                if(a[i] != a[i+1]){
                    System.out.println((i+1) + " " + (n-i-1));

                    for(int  j = 0 ; j <= i ; j++){
                        System.out.print(a[j] + " ");
                    }
                    System.out.println();

                    for(int  j = i+1 ; j <= a.length-1 ; j++){
                        System.out.print(a[j] + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}
