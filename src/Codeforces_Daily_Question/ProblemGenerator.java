package Codeforces_Daily_Question;

import java.util.Scanner;

public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[7];
            String s=sc.next();
            for (int i=0;i<n;i++)
                a[s.charAt(i)-'A']++;
            int c=0;
            for(int i=0;i<7;i++){
                if(a[i]<m){
                    c+=(m-a[i]);
                }
            }
            System.out.println(c);
        }
    }
}
