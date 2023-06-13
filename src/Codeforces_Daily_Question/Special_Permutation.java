package Codeforces_Daily_Question;

import java.util.Scanner;

public class Special_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(n-a<n/2 || b<n/2){
                System.out.println(-1);
                continue;
            }
            boolean flag=false;
            for(int i=n;i>=n/2+1;i--){
                if(i==b){
                    flag=true;
                    continue;
                }
                if(flag==false && i==n/2+1)
                    continue;
                System.out.print(i+" ");
            }
//            if(flag==true)
//                System.out.println();
            System.out.print(a+" ");
            for(int i=1;i<=n/2+1;i++){
                if(i==a){
                    flag=true;
                    continue;
                }
                if(flag==true && i==n/2+1)
                    continue;
                System.out.print(i+" ");
            }
            System.out.print(b+" ");
            System.out.println();
        }
    }
}
