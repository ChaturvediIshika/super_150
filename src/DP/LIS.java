package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(lis(a));
    }
    public static int lis(int a[]){
        List<Integer> ls=new ArrayList<>();
        for(int n:a){
            if(ls.size()==0 ||ls.get(ls.size()-1)<n)
                ls.add(n);
            else {
                int k = 0;
                int l = 0, h = ls.size() - 1;
                while (l <= h) {
                    int mid = (l + h) / 2;
                    if (ls.get(mid) >=n) {
                        h = mid - 1;
                        k = mid;
                    } else
                        l = mid + 1;
                }
                ls.set(k,n);
            }
        }
        return ls.size();
    }
}
