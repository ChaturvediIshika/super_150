package Codeforces_Daily_Question;

import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long max=0;
            for (int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            for (int i=0;i<n;i++){
                long r=a[i]+1;
                for(int j=0;j<n;j++){
                    if(i==j)
                        continue;
                    r*=a[j];
                }
                max=Math.max(max,r);
            }
            System.out.println(max);
        }
    }
}
