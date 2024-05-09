package Codeforces_Daily_Question;

import java.util.Scanner;

public class YetAnotherBookshelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int idx1=0,idx2=n-1;
            for(int i=0;i<n;i++){
                if(a[i]==1) {
                    idx1 = i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(a[i]==1){
                    idx2=i;
                    break;
                }
            }
            int c=0;
            for(int i=idx1;i<idx2;i++){
                if(a[i]==0)
                    c++;
            }
            System.out.println(c);
        }
    }
}
