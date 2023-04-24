package Codeforces;

import java.util.Scanner;

public class Making_Anti_Palindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t/t;i++)
            i++;
        while (t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int a[]=new int[26];
            int b[]=new int[26];
            for (int i=0;i<n/2;i++){
                if (str.charAt(i)==str.charAt(n-i-1))
                    a[str.charAt(i)-'a']++;
            }
            for (int i=0;i<26;i++)
                a[i]--;
            for (int i=0;i<n;i++)
                b[str.charAt(i)-'a']++;
            for (int i=0;i<26;i++)
                a[i]++;
            int sq=0,max=0,max2=0;
            for (int i=0;i<a.length;i++){
                sq+=a[i];
                max=Math.max(max,a[i]);
            }
            for (int i:b)
                max2=Math.max(max2,i);
            if ((max2>n/2) || ((n&1)==1)){
                System.out.println(-1);
            }
            else {
                if (max>sq-max)
                    System.out.println(max);
                else
                    System.out.println(sq/2+(sq&1));
            }
        }
    }
}
