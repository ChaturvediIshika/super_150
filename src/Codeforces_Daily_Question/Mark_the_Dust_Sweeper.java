package Codeforces_Daily_Question;

import java.util.Scanner;

public class Mark_the_Dust_Sweeper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            long sum=a[0];
            for(int i=1;i<n-1;i++){
                if(a[i]!=0)
                    sum+=a[i];
                else if (sum!=0) {
                    sum+=1;
                }
            }
            System.out.println(sum);
        }
    }
}
