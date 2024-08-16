package Codeforces_Daily_Question;

import java.util.Scanner;

public class SeatinginaBus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            boolean f=true;
            int k=sc.nextInt();
            a[k]=1;
            for(int i=1;i<n;i++){
                k= sc.nextInt();
                if(k==1 && n>=2 && a[2]!=1){
                    f=false;
                }
                else if(k==n && n>=2 && a[n-1]!=1){
                    f=false;
                }
                else if((k!=1 || k!=n) && (a[k-1]==0 && a[k+1]==0)){
                    f=false;
                }
                a[k]=1;
            }
            if(f)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
