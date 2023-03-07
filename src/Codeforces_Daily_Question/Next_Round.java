package Codeforces_Daily_Question;

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int m=0;
        for(int i=0;i<k;i++){
            m=a[i];
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]>0 && a[i]>=m)
                c++;
        }
        System.out.println(c);
    }
}
