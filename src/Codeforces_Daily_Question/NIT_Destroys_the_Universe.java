package Codeforces_Daily_Question;

import java.util.Scanner;

public class NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextLong();
            int c=0;
            if(a[0]!=0)
                c++;
            for (int i=1;i<n;i++){
                if(a[i-1]==0 && a[i]!=0)
                    c++;
            }
            System.out.println(Math.min(2,c));
        }
    }
}
