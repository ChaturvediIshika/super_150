package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            List<Integer> ls=new ArrayList<>();
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            ls.add(a[0]);
            for (int i=1;i<n;i++){
                if(a[i-1]>a[i]){
                    ls.add(a[i]);
                }
                ls.add(a[i]);
            }
            System.out.println(ls.size());
            for (int i:ls)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
