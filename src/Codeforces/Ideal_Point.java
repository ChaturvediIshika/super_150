package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class Ideal_Point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            while(n-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(l<=k && k<=r) {
                    for(int j=l;j<=r;j++)
                        map.put(j,map.getOrDefault(j,0)+1);
                }
            }
            System.out.println(check(map,k));
        }
    }
    public static String check(HashMap<Integer,Integer> map,int k){
        int max=Integer.MIN_VALUE;
        int q=-1;
        for(int m:map.keySet()){
            if(map.get(m)>max || map.get(m)==max && m!=k){
                max=map.get(m);
                q=m;
            }
        }
        if(q==k)
            return "YES";
        return "NO";
    }
}
