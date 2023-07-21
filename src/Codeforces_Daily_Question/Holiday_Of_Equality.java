package Codeforces_Daily_Question;

import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
            max=Math.max(max,a[i]);
        }
        long sum=0;
        for(int i=0;i<n;i++)
            sum+=max-a[i];
        System.out.println(sum);
    }
}
