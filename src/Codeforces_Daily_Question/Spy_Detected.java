package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            for (int i=0;i<n-2;i++){
                if(a[i]==a[i+1] && a[i]!=a[i+2]) {
                    System.out.println(i + 3);
                    break;
                }
                else if(a[i]==a[i+2] && a[i]!=a[i+1]) {
                    System.out.println(i + 2);
                    break;
                }
                else if (a[i+1]==a[i+2] && a[i]!=a[i+1]) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
