package Codeforces_Daily_Question;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int c=0,num=1;
            for(int i=0;i<n;i++){
                if(a[i]==num)
                    num++;
                else
                    c++;
            }
            System.out.println((c+k-1)/k);
        }
    }
}
