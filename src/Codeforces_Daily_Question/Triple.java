package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int c=-1;
            for(int i=1;i<n-1;i++){
                if(a[i-1]==a[i]&&a[i]==a[i+1])
                    c=a[i];
            }
            System.out.println(c);
        }
    }
}
