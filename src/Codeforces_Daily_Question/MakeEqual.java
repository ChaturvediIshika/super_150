package Codeforces_Daily_Question;

import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            long avg=sum/n;
            boolean f=true;
            sum=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
                if(sum<avg*(i+1))
                    f=false;
            }
            System.out.println(f?"YES":"NO");
        }
    }
}
