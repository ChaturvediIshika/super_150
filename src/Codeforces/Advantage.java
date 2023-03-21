package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> ls=new ArrayList<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                ls.add(a[i]);
            }
            Collections.sort(ls);
            int q=ls.get(n-1);
            int r=ls.get(n-2);
            for (int m:a){
                if(m==q)
                    System.out.print(q-r+" ");
                else
                    System.out.print(m-q+" ");
            }
            System.out.println();
        }
    }
}
