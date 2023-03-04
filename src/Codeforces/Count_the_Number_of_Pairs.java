package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class Count_the_Number_of_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
//            int i=0;
            HashMap<Character,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++)
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            System.out.println(count(str,n,k));
        }
    }
    public static int count(String str,int n,int k){
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                a[str.charAt(i)-'A']++;
            else
                b[str.charAt(i)-'a']++;
        }
        int cnt=0,min=0;
        for(int i=0;i<26;i++){
            min=Math.min(a[i],b[i]);
            cnt+=min;
            int q=Math.abs(a[i]-b[i])/2;
            if(q<=k){
                k-=q;
                cnt+=q;
            }
            else {
                cnt+=k;
                k=0;
            }
        }
        return cnt;
    }

}
