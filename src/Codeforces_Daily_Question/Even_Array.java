package Codeforces_Daily_Question;

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int o=0,e=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i%2==0 && a[i]%2!=0){
                    e++;
                }
                else if(i%2!=0 && a[i]%2==0)
                    o++;
            }
            if(e!=o)
                System.out.println(-1);
            else
                System.out.println(e);
        }
    }
}
