package Codeforces_Daily_Question;

import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int ans=0,c=0;

            for(int i=0;i<n;i++){
                if(a[i]==0)
                    c++;
                else{
                    ans=Math.max(ans,c);
                    c=0;
                }
            }
            ans=Math.max(ans,c);
            System.out.println(ans);
        }
    }
}
