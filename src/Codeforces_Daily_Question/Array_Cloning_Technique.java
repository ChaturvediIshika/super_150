package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Array_Cloning_Technique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int op=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            int max=0;
            for(int i=0;i<n;i++) {
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
                max=Math.max(max,map.get(a[i]));
            }
            int sum=max;
            while(sum<n){
                op++;
                sum=sum+sum;
            }
            op+=n-max;
            System.out.println(op);
        }
    }
}
