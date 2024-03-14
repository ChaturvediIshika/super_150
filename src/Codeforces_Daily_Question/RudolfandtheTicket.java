package Codeforces_Daily_Question;

import java.util.Scanner;

public class RudolfandtheTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int k=sc.nextInt();
            int b[]=new int[m];
            for(int i=0;i<m;i++)
                b[i]=sc.nextInt();
            int c[]=new int[n];
            for(int i=0;i<n;i++)
                c[i]=sc.nextInt();
            int cnt=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(b[i]+c[j]<=k)
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
