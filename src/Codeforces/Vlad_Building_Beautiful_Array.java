package Codeforces;

import java.util.Scanner;

public class Vlad_Building_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int o=Integer.MAX_VALUE,e=Integer.MAX_VALUE;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0){
                    e=Math.min(e,a[i]);
                }
                else
                    o=Math.min(o,a[i]);
            }
            if(o==Integer.MAX_VALUE || e==Integer.MAX_VALUE)
                System.out.println("YES");
            else if(e>o)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
