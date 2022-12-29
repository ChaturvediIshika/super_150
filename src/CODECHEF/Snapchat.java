package CODECHEF;

import java.util.Scanner;

public class Snapchat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                b[i]= sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                if(a[i]==0 && b[i]==0)
                    c=0;
                else if(a[i]!=0 && b[i]!=0)
                    c++;
            }
            System.out.println(c);
        }
    }
}
