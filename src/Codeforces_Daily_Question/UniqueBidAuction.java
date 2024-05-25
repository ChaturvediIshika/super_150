package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueBidAuction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(a);
            int p=-1;
            for(int i=0;i<n;i++){
                if(n==1)
                    p=a[0];
                else if((i==0 && a[1]==a[0]) ||(i==n-1 && a[n-2]==a[n-1])||(i>0 && i<n-1 && (a[i-1]==a[i]||a[i+1]==a[i])))
                    continue;
                else {
                    p = a[i];
                    break;
                }
            }
            int idx=-1;
            for(int i=0;i<n;i++) {
                if(b[i]==p) {
                    idx = i + 1;
                }
            }
            System.out.println(idx);
        }
    }
}
