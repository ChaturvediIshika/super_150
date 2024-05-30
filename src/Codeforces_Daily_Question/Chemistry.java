package Codeforces_Daily_Question;

import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s= sc.next();
            int f[]=new int[26];
            for(int i=0;i<s.length();i++)
                f[s.charAt(i)-'a']++;
            int c=0;
            for(int i=0;i<26;i++){
                if(f[i]%2!=0){
                    c++;
                }
            }
            int min=Math.min(c-1,k);
            k-=min;
            c-=min;
            if(k==0&&c>1){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
