package Codeforces_Daily_Question;

import java.util.Scanner;

public class XORMixup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int x=0;
            for(int i=0;i<n;i++){
                int m=0;
                for(int j=0;j<n;j++){
                    if(i==j){
                        continue;
                    }
                    else{
                        m=m^a[j];
                    }
                }
                if(a[i]==m){
                    x=a[i];
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
