package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrongVertices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            for (int i=0;i<n;i++)
                b[i]= sc.nextInt();
            strong(a,b);
        }
    }
    public static String check(String str1,String str2,int n1,int n2){
        int c=0;
        for(int i=str2.length()-1;i>=0;i--)
            str1+=str2.charAt(i);
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)==str1.charAt(i+1))
                c++;
        }
        if(c>1)
            return "NO";
        return "YES";
    }
    public static void strong(int a[],int b[]){
        long min=Long.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            min=Math.max(min,a[i]-b[i]);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            if(min==a[i]-b[i])
                ls.add(i+1);
        }
        System.out.println(ls.size());
        for (int i:ls)
            System.out.print(i+" ");
        System.out.println();
    }
    public static long countPair(int a[]){
        boolean visited[]=new boolean[a.length];
        long ans=0;
        for(int i=31;i>=0;i--){
            long c=0;
            for(int j=0;j<a.length;j++){
                if((a[j] &(1<<i))!=0 && visited[j]!=true){
                    c++;
                    visited[j]=true;
                }
            }
            ans=ans+((c*(c-1))/2);
        }
        return ans;
    }
}
