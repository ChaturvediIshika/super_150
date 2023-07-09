package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            boolean f=false;
            Arrays.sort(a);
            for(int i=0;i<n-1;i++){
                if(Math.abs(a[i]-a[i+1])>1){
                    System.out.println("NO");
                    f=true;
                    break;
                }
            }
            if(!f)
                System.out.println("YES");
        }
    }
}
